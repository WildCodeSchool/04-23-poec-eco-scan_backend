package com.poec.projet_backend.util;

import com.poec.projet_backend.domains.login.Role;
import com.poec.projet_backend.domains.login.Login;
import com.poec.projet_backend.domains.login.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private final LoginRepository loginRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if(this.loginRepository.findByEmail("admin@admin.com").isEmpty()) {
            this.createAdmin();
            this.createUsers();
        }
        executeSqlScript("db_setup.sql");
    }

    private void executeSqlScript(String scriptPath) {
        // Execute the SQL script
        try {
            ClassPathResource resource = new ClassPathResource(scriptPath);
            ScriptUtils.executeSqlScript(jdbcTemplate.getDataSource().getConnection(), resource);
        } catch (Exception e) {
            throw new RuntimeException("Failed to execute SQL script: " + scriptPath, e);
        }
    }


    private void createAdmin() {
        Login admin = Login.builder()
                .email("admin@admin.com")
                .password(passwordEncoder.encode("admin"))
                .role("ROLE_" + Role.ADMIN)
                .build();

        this.loginRepository.save(admin);
    }

    private void createUsers() {
        Login user1 = Login.builder()
                .email("user1@user1.com")
                .password(passwordEncoder.encode("user1"))
                .role("ROLE_" + Role.USER)
                .build();

        this.loginRepository.save(user1);
    }
}
