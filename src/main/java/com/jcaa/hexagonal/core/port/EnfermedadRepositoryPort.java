
package com.jcaa.hexagonal.core.port;
import com.jcaa.hexagonal.core.domain.Enfermedad;

import java.util.List;

public interface EnfermedadRepositoryPort {

    List<Enfermedad> findAll();

    Enfermedad findById(Long id);

    Enfermedad save(Enfermedad enfermedad);

    void deleteById(Long id);

    void delete(Long id);
}