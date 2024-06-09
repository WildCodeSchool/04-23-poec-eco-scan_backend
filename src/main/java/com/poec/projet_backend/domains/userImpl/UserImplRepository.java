package com.poec.projet_backend.domains.userImpl;

import com.poec.projet_backend.domains.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserImplRepository extends JpaRepository<UserImpl, Long> {
    Optional<UserImpl> findByEmail(String email);
}
