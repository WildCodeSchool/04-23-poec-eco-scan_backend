package com.poec.projet_backend.domains.type;

import com.poec.projet_backend.util.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TypeMapper {

    @Autowired
    private ImageService imgService;

    public static TypeDTO toDTO(Type type) throws IOException {

        ImageService imgService = new ImageService();
        if (type == null) {
            return null;
        }
        return new TypeDTO(
                type.getId(),
                type.getName(),
                imgService.loadImageAsBase64(type.getPictogram()),
                type.getPoints(),
                type.getDescription(),
                type.getBins()
        );
    }

    public TypeDTO typeToTypeDTO(Type inType) {
        try {
            return new TypeDTO(
                    inType.getId(),
                    inType.getName(),
                    imgService.loadImageAsBase64(inType.getPictogram()),
                    inType.getPoints(),
                    inType.getDescription(),
                    inType.getBins()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<TypeDTO> typeToTypeDTO(List<Type> inTypes) {
        List<TypeDTO> typeDTOs = new ArrayList<>();
        try {
            for (Type type : inTypes) {
                typeDTOs.add(this.typeToTypeDTO(type));
            }
            return typeDTOs;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
