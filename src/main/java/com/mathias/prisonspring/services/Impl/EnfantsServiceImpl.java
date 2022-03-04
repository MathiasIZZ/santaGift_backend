package com.mathias.prisonspring.services.Impl;

import com.mathias.prisonspring.models.Enfants;
import org.springframework.data.jpa.repository.JpaRepository;

public class EnfantsServiceImpl extends GenericServiceImpl<Enfants> {


    public EnfantsServiceImpl(JpaRepository repository){

        super(repository);
    }




}
