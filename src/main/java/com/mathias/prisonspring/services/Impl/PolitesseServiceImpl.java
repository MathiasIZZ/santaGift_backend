package com.mathias.prisonspring.services.Impl;

import com.mathias.prisonspring.models.Politesse;
import org.springframework.data.jpa.repository.JpaRepository;

public class PolitesseServiceImpl extends GenericServiceImpl<Politesse> {


    public PolitesseServiceImpl(JpaRepository repository) {
        super(repository);
    }
}
