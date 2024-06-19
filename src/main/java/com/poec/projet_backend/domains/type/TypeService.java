package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.AbstractService;
import com.poec.projet_backend.domains.promos.Promos;
import com.poec.projet_backend.domains.promos.PromosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService  extends AbstractService<Type, Long> {

    private final TypeRepository typeRepository;

    @Autowired
    public TypeService(JpaRepository<Type, Long> repository, TypeRepository typeRepository) {
        super(repository);
        this.typeRepository = typeRepository;
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

    public List<String> getUniqueNames() {
        return typeRepository.getUniqueNames();
    }

}
