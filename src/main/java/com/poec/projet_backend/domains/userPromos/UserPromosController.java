package com.poec.projet_backend.domains.userPromos;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userPromos")
@RequiredArgsConstructor
public class UserPromosController extends AbstractController<UserPromos> {

    @Autowired
    private UserPromosService userPromosService;
}
