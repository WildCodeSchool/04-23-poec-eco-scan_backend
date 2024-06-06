package com.poec.projet_backend.domains.bin;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class BinService extends AbstractService<Bin, Long>  {

    public BinService(JpaRepository<Bin, Long> repository) {
        super(repository);
    }

    @Override
    public Bin update(Bin entity, Long id) {
        Bin foundBin = getById(id);
        foundBin.setBinName(entity.getBinName());
        foundBin.setLocalisation(entity.getLocalisation());
        return repository.save(foundBin);
    }
}
