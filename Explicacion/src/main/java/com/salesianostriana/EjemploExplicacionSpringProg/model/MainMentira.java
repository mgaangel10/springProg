package com.salesianostriana.EjemploExplicacionSpringProg.model;

import java.util.List;

public class MainMentira {
	private AlumnoRepo alumnoRep;
	private CursoRepo cursoRep;
	public void ejecutar() {
		
		Curso c1 = new Curso ();
		
		Alumno a1 = new Alumno ();
		a1.setNombre("hola");
		a1.setApellidos("hola1");
		a1.setEmail("hola@gmail.com");
		a1.addToCurso(c1);
		
		

		
	}

}
