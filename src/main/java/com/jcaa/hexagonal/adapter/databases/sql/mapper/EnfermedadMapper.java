package com.jcaa.hexagonal.adapter.databases.sql.mapper;

import com.jcaa.hexagonal.adapter.databases.sql.entity.EnfermedadEntity;
import com.jcaa.hexagonal.core.domain.Enfermedad;

public class EnfermedadMapper {

    public static Enfermedad toDomain(EnfermedadEntity entity) {
        return new Enfermedad(
                entity.getId(),
                entity.getNombre(),
                entity.getNombreCientifico(),
                entity.getNivelGravedad(),
                entity.getSintomas(),
                entity.getMedicamentos(),
                entity.isEsContagiosa(),
                entity.isEsCubiertaPorPos(),
                entity.isRequiereIncapacidad()
        );
    }

    public static EnfermedadEntity toEntity(Enfermedad domain) {
        EnfermedadEntity e = new EnfermedadEntity();
        e.setId(domain.getId());
        e.setNombre(domain.getNombre());
        e.setNombreCientifico(domain.getNombreCientifico());
        e.setNivelGravedad(domain.getNivelGravedad());
        e.setSintomas(domain.getSintomas());
        e.setMedicamentos(domain.getMedicamentos());
        e.setEsContagiosa(domain.isEsContagiosa());
        e.setEsCubiertaPorPos(domain.isEsCubiertaPorPos());
        e.setRequiereIncapacidad(domain.isRequiereIncapacidad());
        return e;
    }
}