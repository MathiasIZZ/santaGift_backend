package com.mathias.prisonspring.services.Impl;

import com.mathias.prisonspring.models.Punition;
import org.springframework.data.jpa.repository.JpaRepository;

public class PunitionServiceImpl extends GenericServiceImpl<Punition> {


    public PunitionServiceImpl(JpaRepository repository) {
        super(repository);
    }
}
