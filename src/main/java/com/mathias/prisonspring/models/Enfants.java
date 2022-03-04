package com.mathias.prisonspring.models;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="enfants")
public class Enfants {

    @Id
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="age")
    private int age;

    @ManyToOne
    @JoinColumn(name="danger_id", referencedColumnName = "id")
    private Politesse politesse;

    @ManyToMany
    @JoinTable(
            name="enfant_has_cadeaux",
            joinColumns = @JoinColumn(name="enfant_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="cadeaux_id", referencedColumnName = "id")
    )
    private List<Cadeaux> cadeaux;



}
