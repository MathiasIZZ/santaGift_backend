package com.mathias.prisonspring.services.Impl;

import com.mathias.prisonspring.models.Cadeaux;
import org.springframework.data.jpa.repository.JpaRepository;

public class CadeauxServiceImpl extends GenericServiceImpl<Cadeaux> {

    public CadeauxServiceImpl(JpaRepository repository) {

        super(repository);
    }


}
