package com.poec.projet_backend.domains;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class AbstractService<T, Long> {

    protected JpaRepository<T, Long> repository;


    public AbstractService(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return repository.findAll();
    }

    public T getById(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No entity with id " + id)
        );
    }

    public T add(T entity) {
        return repository.save(entity);
    }

    public abstract T update(T entity, Long id);

    public void delete(Long id) {
        repository.deleteById(id);
    }
}