package com.jcaa.hexagonal.adapter.rest;


import com.jcaa.hexagonal.core.domain.Enfermedad;
import com.jcaa.hexagonal.core.port.EnfermedadServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enfermedades")
public class EnfermedadController {

    private final EnfermedadServicePort service;

    public EnfermedadController(EnfermedadServicePort service) {
        this.service = service;
    }

    @PostMapping
    public Enfermedad crear(@RequestBody Enfermedad e) {
        return service.crear(e);
    }

    @GetMapping
    public List<Enfermedad> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Enfermedad buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}