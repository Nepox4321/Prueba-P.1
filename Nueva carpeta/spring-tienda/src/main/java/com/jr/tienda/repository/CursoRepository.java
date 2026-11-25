package com.jr.tienda.repository;

import com.ejemplo.api.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    @Query("SELECT AVG(c.costo) FROM Curso c")
    Optional<Double> obtenerCostoPromedio();
}