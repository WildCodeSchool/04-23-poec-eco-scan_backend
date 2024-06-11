package com.poec.projet_backend.domains.rubbish;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.domains.type.TypeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rubbish")
@RequiredArgsConstructor
public class RubbishController extends AbstractController<Rubbish> {

    @Autowired
    private RubbishService rubbishService;
}
