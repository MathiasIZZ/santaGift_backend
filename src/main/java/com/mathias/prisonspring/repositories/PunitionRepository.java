package com.mathias.prisonspring.repositories;

import com.mathias.prisonspring.models.Punition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PunitionRepository extends JpaRepository<Punition, Long> {
}
