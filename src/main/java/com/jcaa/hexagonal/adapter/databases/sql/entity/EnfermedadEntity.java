package com.jcaa.hexagonal.adapter.databases.sql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "enfermedad")
@Getter
@Setter
public class EnfermedadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String nombreCientifico;
    private String nivelGravedad;
    private String sintomas;
    private String medicamentos;
    private boolean esContagiosa;
    private boolean esCubiertaPorPos;
    private boolean requiereIncapacidad;
}