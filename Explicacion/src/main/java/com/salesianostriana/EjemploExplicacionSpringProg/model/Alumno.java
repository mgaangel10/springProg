package com.salesianostriana.EjemploExplicacionSpringProg.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre,apellidos,email;
	@ManyToOne
	private Curso curso;
	
}
