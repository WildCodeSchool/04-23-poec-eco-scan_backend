package com.poec.projet_backend.domains.promos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.brand.Brand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Promos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String item;
    private int percentOff;
    private String description;
    private Date startDate;
    private Date endDate;
    private int amount;
    private int price;
    private String color;

    @ManyToOne
    @JsonIgnoreProperties("promos")
    private Brand brand;
}
