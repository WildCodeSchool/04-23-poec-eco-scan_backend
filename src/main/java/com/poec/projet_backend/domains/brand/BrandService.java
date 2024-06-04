package com.poec.projet_backend.domains.brand;

import com.poec.projet_backend.domains.AbstractService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService extends AbstractService<Brand, Long> {


    public BrandService(JpaRepository<Brand, Long> repository) {
        super(repository);
    }

    @Override
    public Brand update(Brand entity, Long id) {
        Brand foundBrand = getById(id);
        foundBrand.setTitle(foundBrand.getTitle());
        foundBrand.setLogo(foundBrand.getLogo());
        return repository.save(foundBrand);
    }
}
