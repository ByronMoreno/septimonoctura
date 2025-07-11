package com.septimo.estudiantes.estudiante;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
@AllArgsConstructor
public class EstudianteController {

    //Instanciar el servicio
    private final EstudianteService estudianteService;

    //Metodo para consultar todos
    @GetMapping()
    public List<Estudiante> getAllEstudiantes(){
        return estudianteService.findAll();
    }

    //Metodo para consultar por ID
    @GetMapping("/{id}")
    public Estudiante getEstudianteById(@PathVariable("id") Long id){
        return estudianteService.findById(id);
    }

    //Metodo para guardar un estudiante
    @PostMapping()
    public Estudiante createEstudiante(@RequestBody Estudiante estudiante){
        return estudianteService.save(estudiante);
    }
}
