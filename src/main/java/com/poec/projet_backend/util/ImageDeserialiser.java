package com.poec.projet_backend.util;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

public class ImageDeserialiser extends JsonDeserializer<ImageWrapper> {

    @Override
    public ImageWrapper deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        return new ImageWrapper(value);
    }
}