package com.jr.tienda.controller;

import com.ejemplo.api.model.Mascota;
import com.jr.tienda.repository.MascotaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

    private final MascotaRepository mascotaRepository;

    public MascotaController(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @GetMapping
    public List<Mascota> listar() {
        return mascotaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mascota registrar(@RequestBody Mascota mascota) {
        mascota.setId(null);
        return mascotaRepository.save(mascota);
    }

    // Ej: GET http://localhost:8083/api/mascotas/especie?nombre=perro
    @GetMapping("/especie")
    public List<Mascota> listarPorEspecie(@RequestParam("nombre") String nombreEspecie) {
        return mascotaRepository.findByEspecieIgnoreCase(nombreEspecie);
    }
}