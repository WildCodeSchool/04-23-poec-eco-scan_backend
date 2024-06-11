package com.poec.projet_backend.domains.rubbish;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.deposit.Deposit;
import com.poec.projet_backend.domains.type.Type;
import com.poec.projet_backend.domains.type.TypeDTO;
import com.poec.projet_backend.domains.type.TypeMapper;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

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

    @JsonGetter("type")
    public TypeDTO getType(){
        try {
            return TypeMapper.toDTO(this.type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @OneToOne
    @JsonIgnoreProperties("rubbish")
    private Deposit deposit;
}
