package com.poec.projet_backend.domains.brand;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/brand")
@RequiredArgsConstructor
public class BrandController {

    @Autowired
    private BrandService brandService;
    private BrandMapper brandMapperService;

    @GetMapping("/get/all")
    public ResponseEntity<List<BrandDTO>> getAll() {
        List<Brand> brands = brandService.getAll();
        return new ResponseEntity<>(brandMapperService.brandToBrandDTO(brands), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<BrandDTO> getById(@PathVariable Long id) {
        Brand foundBrand = brandService.getById(id);
        return new ResponseEntity<>(brandMapperService.brandToBrandDTO(foundBrand), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Brand> add(@RequestBody Brand entity) {
        return new ResponseEntity<>(brandService.add(entity), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Brand> update(@RequestBody Brand entity, @PathVariable Long id) {
        return new ResponseEntity<>(brandService.update(entity, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        brandService.delete(id);
    }
}
