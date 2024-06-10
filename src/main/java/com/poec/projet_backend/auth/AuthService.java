package com.poec.projet_backend.auth;

import com.poec.projet_backend.domains.staged.Staged;
import com.poec.projet_backend.domains.userImpl.UserImpl;
import com.poec.projet_backend.domains.userImpl.UserImplRepository;
import com.poec.projet_backend.exceptions.UsernameAlreadyTakenException;
import com.poec.projet_backend.domains.login.Role;
import com.poec.projet_backend.domains.login.Login;
import com.poec.projet_backend.domains.login.LoginRepository;
import com.poec.projet_backend.util.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final LoginRepository loginRepository;
    private final UserImplRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public Map<String, String> register(RegisterRequest request, HttpServletRequest httpRequest) throws UsernameAlreadyTakenException {
        System.out.println(request.toString());

        if (loginRepository.findByEmail(request.getEmail()).isEmpty()) {
            var login = Login.builder()
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .role("ROLE_" + Role.USER)
                    .build();

            loginRepository.save(login);

            Staged staged = new Staged();

            var user = UserImpl.builder()
                    .email(request.getEmail())
                    .username(request.getUsername())
                    .lastname(request.getLastname())
                    .firstname(request.getFirstname())
                    .points(50)
                    .staged(staged)
                    .build();

            userRepository.save(user);

            Map<String, String> body = new HashMap<>();
            body.put("message", "Bienvenue sur notre application");
            return body;

        } else {
            throw new UsernameAlreadyTakenException("L'email éxiste déjà");
        }

    }

    public AuthResponse authenticate(AuthRequest request, HttpServletRequest httpRequest) {


        /* Permet de comparer le pwd reçu de la request reçue avec le pwd haché de la BDD.
         * La méthode authenticate() permet surtout de garantir que les informations d'identification sont exactes
         * Permet de transmettre au contexte de Spring l'utilisateur qui a été trouvé.
         *  Cela permet de l'utiliser pour autoriser/refuser l'accès aux ressources protégées
         * S'il n'est pas trouvé, une erreur est levée et la méthode s'arrête.
         */
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()
                    )
            );

            /* Si tout va bien et que les informations sont OK, on peut récupérer l'utilisateur */
            /* La méthode findByEmail retourne un type Optionnel. Il faut donc ajouter une gestion d'exception avec "orElseThrow" */
            Login user = loginRepository.findByEmail(request.getEmail())
                    .orElseThrow(() -> new UsernameNotFoundException("User not found in DB"));

            /* On extrait le rôle de l'utilisateur */
            Map<String, Object> extraClaims = new HashMap<>();
            extraClaims.put("role", user.getRole());

            /* On génère le token avec le rôle */
            String jwtToken = jwtService.generateToken(new HashMap<>(extraClaims), user);
            return AuthResponse.builder()
                    .token(jwtToken)
                    .message("Salut le bouffeur de graines!")
                    .build();

        } catch (BadCredentialsException ex) {
            throw new BadCredentialsException("Identifiants incorrects");
        }

    }
}
