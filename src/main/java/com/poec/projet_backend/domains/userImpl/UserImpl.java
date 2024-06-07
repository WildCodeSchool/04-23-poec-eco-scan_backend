package com.poec.projet_backend.domains.userImpl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.staged.Staged;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String lastname;
    private String pseudo;
    private String email;
    private int point;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REMOVE, CascadeType.DETACH })
    @JoinColumn(name = "staged_id")
    @JsonIgnoreProperties("user_id")
    private Staged staged;
}
