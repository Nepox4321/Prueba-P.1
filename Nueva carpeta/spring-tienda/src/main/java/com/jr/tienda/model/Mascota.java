package com.ejemplo.api.model;



import jakarta.persistence.*;
import lombok.Data;


@Entity

@Data

public class Mascota {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    private String nombre;

    private String especie;

    private String raza;

    private Integer edad;

    private Double peso;



    // Getters y setters

}