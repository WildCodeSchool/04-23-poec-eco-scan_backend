package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.AbstractService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeService  extends AbstractService<Type, Long> {


    public TypeService(JpaRepository<Type, Long> repository) {
        super(repository);
    }

    @Override
    public Type update(Type entity, Long id) {
        Type foundType = getById(id);
        foundType.setDescription(entity.getDescription());
        foundType.setName(entity.getName());
        foundType.setPoints(entity.getPoints());
        foundType.setPictogram(entity.getPictogram());

        return repository.save(foundType);
    }
}
