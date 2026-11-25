package com.ejemplo.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String docente;
    private Integer horas;
    private Double costo;
    private String modalidad;

    // Getters y setters
}
