package com.septimo.estudiantes.estudiante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long  id;
    private String name;
    private String email;
}
