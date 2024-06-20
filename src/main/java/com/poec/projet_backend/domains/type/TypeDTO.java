package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.domains.bin.Bin;
import com.poec.projet_backend.util.ImageWrapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TypeDTO {

    private Long id;
    private String name;
    private String pictogram;
    private String pathOfImage;
    private int points;
    private String description;
    private List<Bin> bins;

    TypeDTO(Long id, String name, String path, String imgData, int points, String desc, List<Bin> bins) {
        this.id = id;
        this.name = name;
        this.pictogram = new ImageWrapper(imgData).getImgData();
        this.pathOfImage = path;
        this.points = points;
        this.description = desc;
        this.bins = bins;
    }
}
