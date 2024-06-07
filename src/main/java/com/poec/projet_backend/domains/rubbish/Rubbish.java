package com.poec.projet_backend.domains.rubbish;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.deposit.Deposit;
import com.poec.projet_backend.domains.type.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rubbish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean isDepot = false;

    @ManyToOne
    @JsonIgnoreProperties("rubbish")
    private Type type;

    @OneToOne
    @JsonIgnoreProperties("rubbish")
    private Deposit deposit;
}
