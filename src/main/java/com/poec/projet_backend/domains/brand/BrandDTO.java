package com.poec.projet_backend.domains.brand;

import com.poec.projet_backend.domains.promos.Promos;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class BrandDTO {

    private Long id;
    private String title;
    private String logo;
    private List<Promos> promos;
    private String logoPath;

    BrandDTO(Long id, String title, String logo, List<Promos> promos, String logoPath){
        this.id = id;
        this.title = title;
        this.logo = logo;
        this.promos = promos;
        this.logoPath = logoPath;
    }
}
