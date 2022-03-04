package com.mathias.prisonspring.controllers;

import com.mathias.prisonspring.models.Politesse;
import com.mathias.prisonspring.models.Punition;
import com.mathias.prisonspring.services.Impl.PolitesseServiceImpl;
import com.mathias.prisonspring.services.Impl.PunitionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("politesses")
public class PolitesseController {

    @Autowired
    private PolitesseServiceImpl service;


    @GetMapping
    public List<Politesse> findAll() {

        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Politesse findById(@PathVariable Long id) {

        return this.service.findById(id);
    }

    @PostMapping
    public Politesse save(@RequestBody Politesse politesse) {
        return this.service.save(politesse);
    }

    @PatchMapping
    public Politesse update(@RequestBody Politesse politesse) {
        return this.service.update(politesse);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.service.delete(id);
    }

}
