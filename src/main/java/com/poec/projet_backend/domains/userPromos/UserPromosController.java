package com.poec.projet_backend.domains.userPromos;

import com.poec.projet_backend.domains.AbstractController;
import com.poec.projet_backend.exceptions.NotEnoughPointsExcept;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-promos")
@RequiredArgsConstructor
public class UserPromosController extends AbstractController<UserPromos> {

    @Autowired
    private UserPromosService userPromosService;


    @PostMapping("/add/promos")
    public ResponseEntity<UserPromos> add(@RequestBody UserPromosDTO userPromosDTO) {

        Long userId = userPromosDTO.getUserId();
        Long promoId = userPromosDTO.getPromoId();
            UserPromos newUserPromo = userPromosService.addPromoToUser(userId, promoId);
            return ResponseEntity.ok(newUserPromo);

    }
}
