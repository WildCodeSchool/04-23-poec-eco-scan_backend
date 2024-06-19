package com.poec.projet_backend.domains.staged;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
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

    public Staged addRubbishToStaged(Long stagedId, Rubbish rubbish) {
        Staged staged = repository.findById(stagedId).orElse(null);

        if (staged != null) {
            staged.getRubbish().add(rubbish);
            return repository.save(staged);
        }

        return null;
    }


}
