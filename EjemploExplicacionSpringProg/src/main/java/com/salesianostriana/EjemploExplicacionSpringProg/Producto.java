package com.salesianostriana.EjemploExplicacionSpringProg;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int numeroVotos;
	private double porcentajesatisfaccion;
	public Producto(String nombre, String descripcion, double precio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	

}
