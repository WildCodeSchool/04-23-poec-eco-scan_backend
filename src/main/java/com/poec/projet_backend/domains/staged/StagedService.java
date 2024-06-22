package com.poec.projet_backend.domains.staged;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import com.poec.projet_backend.domains.rubbish.RubbishRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StagedService extends AbstractService<Staged, Long> {

    @Autowired
    private RubbishRepository rubbishRepository;

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

    @Transactional
    public void removeRubbishFromStaged(long stagedId, long rubbishId) {
        Staged staged = repository.findById(stagedId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid staged Id:" + stagedId));

        Rubbish rubbish = rubbishRepository.findById(rubbishId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid rubbish Id:" + rubbishId));

        staged.getRubbish().remove(rubbish);
        repository.save(staged);
    }


}
