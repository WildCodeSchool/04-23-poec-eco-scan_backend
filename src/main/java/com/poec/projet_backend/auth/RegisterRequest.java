package com.poec.projet_backend.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String username;
    private int points;
    private String email;
    private String password;
    private String requiredRole;

    public String toString() {
        return firstname + " " + lastname + " " + username + " " + points + " " + email + " " + password + " " + requiredRole;
    }
}