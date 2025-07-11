package com.septimo.estudiantes.estudiante;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    //Metodo seleccionar todos
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    //Metodo para seleccionar por ID
    public Estudiante findById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    //Metodo para guardar un estudiante
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
