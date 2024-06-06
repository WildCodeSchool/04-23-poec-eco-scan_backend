package com.poec.projet_backend.domains.type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String pictogram;
    private int points;
    private String description;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("type")
    private List<Rubbish> rubbishes = new ArrayList<>();

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("type")
    private List<Rubbish> bins = new ArrayList<>();

}
