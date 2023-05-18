package com.account.nuban.repository;

import com.account.nuban.model.Nuban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NubanRepository extends JpaRepository<Nuban, Long> {
    Optional<Nuban> findById(Long id);
}
