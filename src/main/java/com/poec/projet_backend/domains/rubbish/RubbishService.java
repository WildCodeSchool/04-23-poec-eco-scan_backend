package com.poec.projet_backend.domains.rubbish;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class RubbishService extends AbstractService<Rubbish, Long> {

    public RubbishService(JpaRepository<Rubbish, Long> repository) {
        super(repository);
    }

    @Override
    public Rubbish update(Rubbish entity, Long id) {
        Rubbish foundRubbish = getById(id);
        foundRubbish.setDepot(entity.isDepot());

        return repository.save(foundRubbish);
    }
}
