package com.poec.projet_backend.domains.bin;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bin")
@RequiredArgsConstructor
public class BinController extends AbstractController<Bin> {

    @Autowired
    private BinService binService;
}
