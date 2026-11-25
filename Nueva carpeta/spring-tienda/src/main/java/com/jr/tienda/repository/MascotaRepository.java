package com.jr.tienda.repository;

import com.ejemplo.api.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    List<Mascota> findByEspecieIgnoreCase(String especie);
}