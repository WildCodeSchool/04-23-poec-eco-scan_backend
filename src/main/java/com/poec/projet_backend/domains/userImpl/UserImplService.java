package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class UserImplService extends AbstractService<UserImpl, Long> {

    public UserImplService(UserImplRepository repository) {
        super(repository);
    }


    @Override
    public UserImpl update(UserImpl entity, Long id) {
        return null;
    }
}
