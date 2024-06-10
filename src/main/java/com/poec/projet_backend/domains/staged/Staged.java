package com.poec.projet_backend.domains.staged;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.poec.projet_backend.domains.rubbish.Rubbish;
import com.poec.projet_backend.domains.userImpl.UserImpl;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Staged {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "staged")
    @JsonIgnoreProperties("staged")
    private UserImpl user_id;

    @OneToMany(mappedBy = "staged", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("staged")
    private List<Rubbish> rubbishes = new ArrayList<>();
}
