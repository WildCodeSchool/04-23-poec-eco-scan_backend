package com.poec.projet_backend.domains.promos;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PromosService extends AbstractService<Promos, Long> {

    private final PromosRepository promosRepository;

    @Autowired
    public PromosService(PromosRepository promosRepository) {
        super(promosRepository);
        this.promosRepository = promosRepository;
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

    public List<Promos> sortByPercentOff() {
        return promosRepository.sortPromosByPercentOff();
    }
}
