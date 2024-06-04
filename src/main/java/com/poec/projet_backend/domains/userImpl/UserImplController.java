package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserImplController extends AbstractController<UserImpl> {


    @Autowired
    private UserImplService userService;
}
