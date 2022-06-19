
package com.practica.experiencia.repository;

import com.practica.experiencia.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
