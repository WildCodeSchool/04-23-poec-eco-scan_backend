package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.bin.Bin;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TypeDTO {

    private Long id;
    private String name;
    private String pictogram;
    private int points;
    private String description;
    private List<Bin> bins;

    TypeDTO(Long id, String name, String picto, int points, String desc, List<Bin> bins) {
        this.id = id;
        this.name = name;
        this.pictogram = picto;
        this.points = points;
        this.description = desc;
        this.bins = bins;
    }
}
