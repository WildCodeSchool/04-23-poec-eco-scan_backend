package com.poec.projet_backend.domains.userPromos;

import lombok.Data;

@Data
public class UserPromosDTO {

    private Long userId;
    private Long promoId;

    UserPromosDTO(Long userId, Long promoId) {
        this.userId = userId;
        this.promoId = promoId;
    }
}
