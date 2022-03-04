package com.mathias.prisonspring.controllers;

import com.mathias.prisonspring.models.Cadeaux;
import com.mathias.prisonspring.models.Enfants;
import com.mathias.prisonspring.services.Impl.CadeauxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("cadeaux")
public class CadeauxController {

    @Autowired
    private CadeauxServiceImpl service;


    @GetMapping
    public List<Cadeaux> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Cadeaux findById(@PathVariable Long id) {

        return this.service.findById(id);
    }

    @PostMapping
    public Cadeaux save(@RequestBody Cadeaux cadeaux) {
        return this.service.save(cadeaux);
    }

    @PatchMapping
    public Cadeaux update(@RequestBody Cadeaux cadeaux) {
        return this.service.update(cadeaux);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }




}
