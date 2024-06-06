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
        foundUser.setUsername(entity.getUsername());
        foundUser.setFirstname(entity.getFirstname());
        foundUser.setLastname(entity.getLastname());
        foundUser.setEmail(entity.getEmail());
        foundUser.setPoints(entity.getPoints());
        return repository.save(foundUser);
    }
}
