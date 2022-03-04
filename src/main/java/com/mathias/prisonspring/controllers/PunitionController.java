package com.mathias.prisonspring.controllers;

import com.mathias.prisonspring.models.Enfants;
import com.mathias.prisonspring.models.Punition;
import com.mathias.prisonspring.services.Impl.EnfantsServiceImpl;
import com.mathias.prisonspring.services.Impl.PunitionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("punitions")
public class PunitionController {

    @Autowired
    private PunitionServiceImpl service;


    @GetMapping
    public List<Punition> findAll() {

        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Punition findById(@PathVariable Long id) {

        return this.service.findById(id);
    }

    @PostMapping
    public Punition save(@RequestBody Punition punition) {
        return this.service.save(punition);
    }

    @PatchMapping
    public Punition update(@RequestBody Punition punition) {
        return this.service.update(punition);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }



}
