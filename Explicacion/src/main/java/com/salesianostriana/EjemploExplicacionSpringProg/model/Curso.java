package com.salesianostriana.EjemploExplicacionSpringProg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
@Id
@GeneratedValue
private Long id;
private Alumno alumno;
private String tutor;
}
