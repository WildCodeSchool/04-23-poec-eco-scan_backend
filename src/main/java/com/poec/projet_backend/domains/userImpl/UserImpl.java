package com.poec.projet_backend.domains.userImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.deposit.Deposit;
import com.poec.projet_backend.domains.login.Login;
import com.poec.projet_backend.domains.staged.Staged;
import com.poec.projet_backend.domains.userPromos.UserPromos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private int points;
    private String imagePath;

    public String toString() {
        return getUsername() + " " + getFirstname() + " " + getLastname() + " " + getEmail() + " " + getPoints();
    };


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    private List<UserPromos> userPromos;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    private List<Deposit> deposits;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REMOVE, CascadeType.DETACH })
    @JoinColumn(name = "staged_id")
    @JsonIgnoreProperties("user_id")
    private Staged staged;


}
