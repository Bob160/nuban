package com.account.nuban.repository;

import com.account.nuban.model.Nuban;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NubanRepository extends JpaRepository<Nuban, Long> {
    Optional<Nuban> findById(Long id);
}
