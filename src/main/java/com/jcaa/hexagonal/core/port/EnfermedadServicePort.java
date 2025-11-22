package com.jcaa.hexagonal.core.port;


import com.jcaa.hexagonal.core.domain.Enfermedad;
import java.util.List;

public interface EnfermedadServicePort {

    Enfermedad crear(Enfermedad enfermedad);
    List<Enfermedad> listar();
    Enfermedad buscar(Long id);
    void eliminar(Long id);
}