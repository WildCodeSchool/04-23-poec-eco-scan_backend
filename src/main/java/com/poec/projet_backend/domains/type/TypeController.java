package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.util.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/type")
@RequiredArgsConstructor
public class TypeController {

    @Autowired
    private TypeService typeService;
    private TypeMapper typeMapperService;

    @GetMapping("/get/all")
    public ResponseEntity<List<TypeDTO>> getAll() {
        List<Type> types = typeService.getAll();
        return new ResponseEntity<>(typeMapperService.typeToTypeDTP(types), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TypeDTO> getById(@PathVariable Long id) {
        Type foundType = typeService.getById(id);
        return new ResponseEntity<>(typeMapperService.typeToTypeDTP(foundType), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Type> add(@RequestBody Type entity) {
        return new ResponseEntity<>(typeService.add(entity), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Type> update(@RequestBody Type entity, @PathVariable Long id) {
        return new ResponseEntity<>(typeService.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        typeService.delete(id);
    }

}
