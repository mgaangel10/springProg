package com.salesianostriana.EjemploExplicacionSpringProg;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	@Autowired
	private AlumnoRepo alumnoRepositorio;
	
	@PostConstruct
	public void ejecutar() {
		Alumno a1 = Alumno.builder()
				.id(1L)
				.nombre("pepe")
				.apellidos("pepito")
				.edad(23)
				.build();
		alumnoRepositorio.save(a1);
		List<Alumno> result = alumnoRepositorio.findAll();
		result.forEach(System.out::println);
	}

}
