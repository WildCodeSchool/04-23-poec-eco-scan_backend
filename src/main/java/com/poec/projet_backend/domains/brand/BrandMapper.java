package com.poec.projet_backend.domains.brand;

import com.poec.projet_backend.util.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BrandMapper {

    @Autowired
    private ImageService imgService;

    public static BrandDTO toDTO(Brand brand) throws IOException {

        ImageService imgService = new ImageService();
        if (brand == null) {
            return null;
        }
        return new BrandDTO(
                brand.getId(),
                brand.getTitle(),
                imgService.loadImageAsBase64(brand.getLogo()),
                brand.getPromos(),
                brand.getLogo()
        );
    }

    public static Brand fromDTO(BrandDTO brand) throws IOException {

        if (brand == null) {
            return null;
        }
        return new Brand(
                brand.getId(),
                brand.getTitle(),
                brand.getLogoPath(),
                brand.getPromos()

        );
    }

    public BrandDTO brandToBrandDTO(Brand inBrand) {
        try {

            return new BrandDTO(
                    inBrand.getId(),
                    inBrand.getTitle(),
                    imgService.loadImageAsBase64(inBrand.getLogo()),
                    inBrand.getPromos(),
                    inBrand.getLogo()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<BrandDTO> brandToBrandDTO(List<Brand> inBrands) {
        List<BrandDTO> brandDTOs = new ArrayList<>();
        try {
            for (Brand brand : inBrands) {
                brandDTOs.add(this.brandToBrandDTO(brand));
            }
            return brandDTOs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Brand brandFromBrandDTO(BrandDTO brandDTO) {
        try {
            return new Brand(
                    brandDTO.getId(),
                    brandDTO.getTitle(),
                    brandDTO.getLogoPath(),
                    brandDTO.getPromos()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    };
}
