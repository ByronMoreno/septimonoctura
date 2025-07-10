package com.septimo.universidad.universidades;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversidadService {

    //Inyeccion de pendencias
    private final UniversidadRepository universidadRepository;

    //Metodo para obtener todos get
    public List<Univerdad> getUniversidades() {
        return universidadRepository.findAll();
    }

    //Metodo para obtener por id get
    public Univerdad getUniversidad(Long id) {
        return universidadRepository.findById(id).orElse(null);
    }

    //Metodo para crear post
    public Univerdad save(Univerdad univerdad){
        return universidadRepository.save(univerdad);
    }

    //Metodo para borrar delete
    public void delete(Long id){
        universidadRepository.deleteById(id);
    }

    //Metodo para actualizar  put, patch
}
