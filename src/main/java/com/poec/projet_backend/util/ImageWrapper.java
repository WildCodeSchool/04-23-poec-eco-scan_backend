package com.poec.projet_backend.util;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@JsonDeserialize(using = ImageDeserialiser.class)
public class ImageWrapper {
    private String imgData;
}
