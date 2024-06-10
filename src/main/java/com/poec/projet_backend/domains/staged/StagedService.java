package com.poec.projet_backend.domains.staged;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StagedService extends AbstractService<Staged, Long> {

    public StagedService(JpaRepository<Staged, Long> repository) {
        super(repository);
    }

    @Override
    public Staged update(Staged entity, Long id) {
        return null;
    }


}
