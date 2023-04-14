package com.salesianostriana.EjemploExplicacionSpringProg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//esto de abajo es para ahorrar los constructuores y geter y seter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona {
	
	private String nombre;
	private String apellidos;

}
