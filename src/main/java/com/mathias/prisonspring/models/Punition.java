package com.mathias.prisonspring.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="punition")
public class Punition {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="numero")
    private int numero;

    @OneToOne
    @JoinColumn(name="enfant_id", referencedColumnName = "id")
    private Enfants enfants;


}
