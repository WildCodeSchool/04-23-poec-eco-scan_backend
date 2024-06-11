package com.poec.projet_backend.domains.promos;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface PromosRepository extends JpaRepository<Promos, Long> {
    List<Promos> sortPromosByPercentOff();
}
