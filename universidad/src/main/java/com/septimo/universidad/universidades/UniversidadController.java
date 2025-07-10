package com.septimo.universidad.universidades;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universidades")
@AllArgsConstructor
public class UniversidadController {

    //Inyeccion de dependencias
    private final UniversidadService universidadService;

    //Metodo Get para todos
    @GetMapping()
    public List<Univerdad> findAll() {
        return universidadService.getUniversidades();
    }
    //Metodo Get por id
    @GetMapping("/{id}")
    public Univerdad findById(@PathVariable("id") Long id) {
        return universidadService.getUniversidad(id);
    }

    //Metodo post
    @PostMapping()
    public Univerdad save(@RequestBody Univerdad univerdad) {
        return universidadService.save(univerdad);
    }

    //Metodo delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        universidadService.delete(id);
    }
}
