package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/type")
@RequiredArgsConstructor
public class TypeController  extends AbstractController<Type> {

    @Autowired
    private TypeService typeService;
}
