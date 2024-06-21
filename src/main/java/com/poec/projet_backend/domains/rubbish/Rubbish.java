package com.poec.projet_backend.domains.rubbish;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.poec.projet_backend.domains.type.Type;
import com.poec.projet_backend.domains.type.TypeDTO;
import com.poec.projet_backend.domains.type.TypeMapper;
import com.poec.projet_backend.exceptions.MappingConversionException;
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
            throw new MappingConversionException("JsonGetter of Rubbish Type: " + e.getMessage());
        }
    }

    @JsonSetter("type")
    public void setType(TypeDTO inType){
        try {
            this.type = TypeMapper.fromDTO(inType);
        } catch (IOException e) {
            throw new MappingConversionException("JsonSetter of Rubbish Type:" + e.getMessage());
        }
    }

}
