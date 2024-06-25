package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.deposit.Deposit;
import com.poec.projet_backend.domains.staged.Staged;
import com.poec.projet_backend.domains.userPromos.UserPromos;
import lombok.Data;

import java.util.List;

@Data
public class UserImplDTO {

    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private int points;
    private String imagePath;
    private String data;
    private List<UserPromos> userPromos;
    private List<Deposit> deposits;
    private Staged staged;

    UserImplDTO(Long id, String username, String firstname, String lastname, String email, int points, String imagePath, String data, List<UserPromos> userPromos, List<Deposit> deposits, Staged staged) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.points = points;
        this.imagePath = imagePath;
        this.data = data;
        this.userPromos = userPromos;
        this.deposits = deposits;
        this.staged = staged;

    }
}
