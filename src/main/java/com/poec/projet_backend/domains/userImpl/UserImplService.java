package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserImplService extends AbstractService<UserImpl, Long> {

    public UserImplService(JpaRepository<UserImpl, Long> repository) {
        super(repository);
    }

    @Override
    public UserImpl update(UserImpl entity, Long id) {
        UserImpl foundUser = getById(id);
        foundUser.setEmail(entity.getEmail());
        foundUser.setUsername(entity.getUsername());
        foundUser.setLastname(entity.getLastname());
        foundUser.setPseudo(entity.getPseudo());
        foundUser.setPoint(entity.getPoint());

        return repository.save(foundUser);
    }
}
