package com.mathias.prisonspring.config;

import com.mathias.prisonspring.repositories.CadeauxRepository;
import com.mathias.prisonspring.repositories.EnfantsRepository;
import com.mathias.prisonspring.repositories.PolitesseRepository;
import com.mathias.prisonspring.repositories.PunitionRepository;
import com.mathias.prisonspring.services.Impl.CadeauxServiceImpl;
import com.mathias.prisonspring.services.Impl.EnfantsServiceImpl;
import com.mathias.prisonspring.services.Impl.PolitesseServiceImpl;
import com.mathias.prisonspring.services.Impl.PunitionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServiceConfig {

    @Bean
    public EnfantsServiceImpl enfantsServiceFactory(EnfantsRepository repository) {
        return new EnfantsServiceImpl(repository);
    }

    @Bean
    public CadeauxServiceImpl cadeauxServiceFactory(CadeauxRepository repository) {
        return new CadeauxServiceImpl(repository);
    }

    @Bean
    public PolitesseServiceImpl politesseServiceFactory(PolitesseRepository repository) {
        return new PolitesseServiceImpl(repository);
    }

    @Bean
    public PunitionServiceImpl punitionServiceFactory(PunitionRepository repository) {
        return new PunitionServiceImpl(repository);
    }














}
