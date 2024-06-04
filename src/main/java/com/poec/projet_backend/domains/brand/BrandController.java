package com.poec.projet_backend.domains.brand;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/brand")
@RequiredArgsConstructor
public class BrandController extends AbstractController<Brand> {

    @Autowired
    private BrandService brandService;

}
