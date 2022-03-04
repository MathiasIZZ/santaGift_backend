package com.mathias.prisonspring.repositories;

import com.mathias.prisonspring.models.Cadeaux;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadeauxRepository extends JpaRepository<Cadeaux, Long> {
}
