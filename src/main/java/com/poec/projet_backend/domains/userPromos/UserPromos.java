package com.poec.projet_backend.domains.userPromos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.promos.Promos;
import com.poec.projet_backend.domains.userImpl.UserImpl;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPromos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean isRedeemed;
    private boolean isPurchased = false;

    @ManyToOne
    @JsonIgnoreProperties("userPromos")
    private UserImpl user;

    @ManyToOne
    @JsonIgnoreProperties("userPromos")
    private Promos promos;
}
