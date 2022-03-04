package com.mathias.prisonspring.models;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="cadeaux")
@Data
public class Cadeaux {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;


    private int punition;
}

