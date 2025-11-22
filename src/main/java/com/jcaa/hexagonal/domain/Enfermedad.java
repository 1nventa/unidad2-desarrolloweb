package com.jcaa.hexagonal.domain;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Enfermedad {

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