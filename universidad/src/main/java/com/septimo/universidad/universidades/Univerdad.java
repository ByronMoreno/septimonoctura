package com.septimo.universidad.universidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Univerdad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull(message = "El nombre es obligatorio")
    @Size(min = 1, max = 10, message = "Minimo 1 y maximo 10")
    private String nombre;

    @Past(message = "La fecha no es bien")
    private Date fechaFundacion;
    private Boolean estado;

    @Min(value = 1, message = "El valor minimo es 1")
    @Max(value = 1000, message = "El valor maximo es de 1000")
    private Integer presupuesto;

    @Email(message = "De ingresar un mail valido")
    private String email;
}
