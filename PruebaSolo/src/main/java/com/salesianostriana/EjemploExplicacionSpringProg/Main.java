package com.salesianostriana.EjemploExplicacionSpringProg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private ProductoRepo productorep;
	@PostConstruct
	public void ejecutar() {
		Producto p1 = Producto.builder()
				
			.id(1L)
			.title("manzanas")
			.done(true)
			.limitDate(LocalDateTime.now())
			
			.build();
		
	productorep.save(p1);

	List<Producto> result = productorep.findAll();
	result.forEach(System.out::println);
		
	}
	
			
}
