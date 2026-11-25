package com.ejemplo.api.model;



import jakarta.persistence.*;
import lombok.Data;


@Entity

@Data

public class Habitacion {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    private String numero;

    private String tipo;

    private Double precioNoche;

    private Integer capacidad;

    private Boolean disponible;



    // Getters y setters

}