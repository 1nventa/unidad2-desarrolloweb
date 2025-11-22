package com.jcaa.hexagonal.core.service;

import com.jcaa.hexagonal.core.domain.Enfermedad;
import com.jcaa.hexagonal.core.port.EnfermedadRepositoryPort;
import com.jcaa.hexagonal.core.port.EnfermedadServicePort;

import java.util.List;

public class EnfermedadService implements EnfermedadServicePort {

    private final EnfermedadRepositoryPort repository;

    public EnfermedadService(EnfermedadRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Enfermedad crear(Enfermedad enfermedad) {
        return repository.save(enfermedad);
    }

    @Override
    public List<Enfermedad> listar() {
        return repository.findAll();
    }

    @Override
    public Enfermedad buscar(Long id) {
        return repository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        repository.delete(id);
    }
}