package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.staged.Staged;
import com.poec.projet_backend.exceptions.MappingConversionException;
import com.poec.projet_backend.util.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    @Autowired
    private ImageService imageService;

//    public static UserImplDTO mapUserToUser(UserImpl user) throws I {}

    public UserImplDTO mapUserToUser(UserImpl user) {
        try {
            Staged staged = user.getStaged();

            return new UserImplDTO(
                    user.getId(),
                    user.getUsername(),
                    user.getFirstname(),
                    user.getLastname(),
                    user.getEmail(),
                    user.getPoints(),
                    user.getImagePath(),
                    imageService.loadImageAsBase64(user.getImagePath()),
                    user.getUserPromos(),
                    user.getDeposits(),
                    staged
            );
        } catch (Exception e) {
            throw new MappingConversionException("Failed converting Type to TypeDTO: " + e.getMessage());
        }
    }
}
