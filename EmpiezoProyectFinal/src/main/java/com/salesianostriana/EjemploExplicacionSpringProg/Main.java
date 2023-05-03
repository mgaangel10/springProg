package com.salesianostriana.EjemploExplicacionSpringProg;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class Main {
	private  ClienteRepo cliente;
	private ReservaRepo reserva;
	
	public void ejecutar() {
		Reserva reser = Reserva.builder()
				.fecha("hoy")
				.hora("hoyyyy")
				.build();
				
				
	}

}
