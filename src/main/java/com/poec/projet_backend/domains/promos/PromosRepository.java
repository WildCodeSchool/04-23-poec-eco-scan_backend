package com.poec.projet_backend.domains.promos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PromosRepository extends JpaRepository<Promos, Long> {
    @Query("SELECT p FROM Promos p ORDER BY p.percentOff DESC")
    List<Promos> sortPromosByPercentOff();
}
