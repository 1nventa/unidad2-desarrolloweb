package com.jcaa.hexagonal.adapter.databases.sql.adapter;


import com.jcaa.hexagonal.adapter.databases.sql.entity.EnfermedadEntity;
import com.jcaa.hexagonal.adapter.databases.sql.mapper.EnfermedadMapper;
import com.jcaa.hexagonal.adapter.databases.sql.repository.EnfermedadJpaRepository;
import com.jcaa.hexagonal.core.domain.Enfermedad;
import com.jcaa.hexagonal.core.port.EnfermedadRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnfermedadRepositoryAdapter implements EnfermedadRepositoryPort {

    private final EnfermedadJpaRepository repository;

    public EnfermedadRepositoryAdapter(EnfermedadJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Enfermedad save(Enfermedad enfermedad) {
        EnfermedadEntity entity = EnfermedadMapper.toEntity(enfermedad);
        return EnfermedadMapper.toDomain(repository.save(entity));
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Enfermedad> findAll() {
        return repository.findAll()
                .stream()
                .map(EnfermedadMapper::toDomain)
                .toList();
    }

    @Override
    public Enfermedad findById(Long id) {
        return repository.findById(id)
                .map(EnfermedadMapper::toDomain)
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}