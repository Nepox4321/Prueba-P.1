package com.jr.tienda.controller;

import com.ejemplo.api.model.Habitacion;
import com.ejemplo.api.repository.HabitacionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habitaciones")
public class HabitacionController {

    private final HabitacionRepository habitacionRepository;

    public HabitacionController(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }

    @GetMapping
    public List<Habitacion> listar() {
        return habitacionRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Habitacion registrar(@RequestBody Habitacion habitacion) {
        habitacion.setId(null);
        return habitacionRepository.save(habitacion);
    }

    // GET http://localhost:8083/api/habitaciones/disponibles
    @GetMapping("/disponibles")
    public List<Habitacion> listarDisponibles() {
        return habitacionRepository.findByDisponibleTrue();
    }
}