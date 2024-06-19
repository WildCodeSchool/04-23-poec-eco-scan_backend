package com.poec.projet_backend.domains.type;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Long> {

    @Query("SELECT DISTINCT t.name FROM Type t")
    List<String> getUniqueNames();

}
