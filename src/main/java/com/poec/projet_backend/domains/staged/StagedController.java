package com.poec.projet_backend.domains.staged;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.domains.rubbish.RubbishService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/staged")
@RequiredArgsConstructor
public class StagedController extends AbstractController<Staged> {

    @Autowired
    private StagedService stagedService;
}
