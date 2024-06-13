package com.poec.projet_backend.domains.promos;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface PromosRepository extends JpaRepository<Promos, Long> {
    @Query("SELECT p FROM Promos p ORDER BY p.percentOff DESC")
    List<Promos> sortPromosByPercentOff();

    @Query("SELECT p FROM Promos p ORDER BY p.endDate DESC")
    List<Promos> findTopPromos(Pageable pageable);

    default List<Promos> sortPromosByReleaseDate() {
        Pageable pageable = PageRequest.of(0, 10);
        return findTopPromos(pageable);
    }
}
