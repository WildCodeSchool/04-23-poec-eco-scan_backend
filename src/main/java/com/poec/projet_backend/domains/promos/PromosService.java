package com.poec.projet_backend.domains.promos;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.brand.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PromosService extends AbstractService<Promos, Long> {

    public PromosService(JpaRepository<Promos, Long> repository) {
        super(repository);
    }

    @Override
    public Promos update(Promos entity, Long id) {
        Promos foundPromo = getById(id);
        foundPromo.setTitle(entity.getTitle());
        foundPromo.setItem(entity.getItem());
        foundPromo.setPercentOff(entity.getPercentOff());
        foundPromo.setDescription(entity.getDescription());
        foundPromo.setStartDate(entity.getStartDate());
        foundPromo.setEndDate(entity.getEndDate());
        foundPromo.setAmount(entity.getAmount());
        foundPromo.setPrice(entity.getPrice());
        foundPromo.setColor(entity.getColor());

        return repository.save(foundPromo);
    }
}
