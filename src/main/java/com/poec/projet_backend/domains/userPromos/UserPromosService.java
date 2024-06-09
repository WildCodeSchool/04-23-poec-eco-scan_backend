package com.poec.projet_backend.domains.userPromos;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.promos.Promos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserPromosService extends AbstractService<UserPromos, Long> {

    public UserPromosService(JpaRepository<UserPromos, Long> repository) {
        super(repository);
    }

    
    @Override
    public UserPromos update(UserPromos entity, Long id) {
        UserPromos foundUserPromo = getById(id);
        foundUserPromo.setPromos(entity.getPromos());
        foundUserPromo.setRedeemed(entity.isRedeemed());
        return repository.save(foundUserPromo);
    }
}
