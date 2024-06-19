package com.poec.projet_backend.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractController<T> {

    @Autowired
    private AbstractService<T, Long> service;


    @GetMapping("/get/all")
    public ResponseEntity<List<T>> getAll() {
        List<T> entity = service.getAll();
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<T> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<T> add(@RequestBody T entity) {
        return new ResponseEntity<>(service.add(entity), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<T> update(@RequestBody T entity, @PathVariable Long id) {
        return new ResponseEntity<>(service.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}