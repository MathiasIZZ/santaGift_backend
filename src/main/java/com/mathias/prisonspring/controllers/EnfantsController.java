package com.mathias.prisonspring.controllers;


import com.mathias.prisonspring.models.Enfants;
import com.mathias.prisonspring.services.Impl.EnfantsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("enfants")
public class EnfantsController {

    @Autowired
    private EnfantsServiceImpl service;


    @GetMapping
    public List<Enfants> findAll() {

        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Enfants findById(@PathVariable Long id) {

        return this.service.findById(id);
    }

    @PostMapping
    public Enfants save(@RequestBody Enfants enfants) {
        return this.service.save(enfants);
    }

    @PatchMapping
    public Enfants update(@RequestBody Enfants enfants) {
        return this.service.update(enfants);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }








}
