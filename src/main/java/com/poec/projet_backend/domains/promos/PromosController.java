package com.poec.projet_backend.domains.promos;

import com.poec.projet_backend.domains.AbstractController;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/promos")
@RequiredArgsConstructor
public class PromosController extends AbstractController<Promos> {

    @Autowired
    private PromosService promosService;

    @GetMapping("/get/percentOff")
    public ResponseEntity<List<Promos>> getPromosOrderedByPercentOff() {
        List<Promos> promotions = promosService.sortByPercentOff();
        return ResponseEntity.ok(promotions);
    }
}
