package com.jcaa.hexagonal.application;


import com.jcaa.hexagonal.core.domain.Enfermedad;
import com.jcaa.hexagonal.core.port.EnfermedadRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnfermedadService {

    private final EnfermedadRepositoryPort repositoryPort;

    public EnfermedadService(EnfermedadRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    public List<Enfermedad> obtenerTodas() {
        return repositoryPort.findAll();
    }

    public Enfermedad obtenerPorId(Long id) {
        return repositoryPort.findById(id);
    }

    public Enfermedad crear(Enfermedad enfermedad) {
        return repositoryPort.save(enfermedad);
    }

    public Optional<Enfermedad> actualizar(Long id, Enfermedad enfermedad) {
        Optional<Enfermedad> existente = Optional.ofNullable(repositoryPort.findById(id));

        if (existente.isEmpty()) {
            return Optional.empty();
        }

        enfermedad.setId(id);
        Enfermedad actualizada = repositoryPort.save(enfermedad);
        return Optional.of(actualizada);
    }

    public boolean eliminar(Long id) {
        Optional<Enfermedad> existente = Optional.ofNullable(repositoryPort.findById(id));

        if (existente.isEmpty()) {
            return false;
        }

        repositoryPort.deleteById(id);
        return true;
    }
}