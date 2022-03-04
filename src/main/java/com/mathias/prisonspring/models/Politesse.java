package com.mathias.prisonspring.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="politesse")
public class Politesse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;


}
