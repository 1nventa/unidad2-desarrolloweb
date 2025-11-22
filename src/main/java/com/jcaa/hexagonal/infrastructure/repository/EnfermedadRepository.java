package com.jcaa.hexagonal.infrastructure.repository;

import com.jcaa.hexagonal.domain.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long> {

}