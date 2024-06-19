package com.poec.projet_backend.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class ImageService {

    public String loadImageAsBase64(String imagePath) throws IOException {
        InputStream imageStream = getClass().getClassLoader().getResourceAsStream(imagePath);
        byte[] imageBytes = imageStream.readAllBytes();
        return Base64.encodeBase64String(imageBytes);
    }
}
