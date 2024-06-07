package com.poec.projet_backend.domains.deposit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.bin.Bin;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import com.poec.projet_backend.domains.userImpl.UserImpl;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String scanData;

    @ManyToOne
    @JsonIgnoreProperties("deposits")
    private UserImpl user;

    @ManyToOne
    @JsonIgnoreProperties("deposits")
    private Bin bin;

    @OneToOne
    @JsonIgnoreProperties("deposit")
    private Rubbish rubbish;
}
