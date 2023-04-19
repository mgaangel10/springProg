package com.salesianostriana.EjemploExplicacionSpringProg;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
	private Long id;
	private String title;
	private boolean done;
	private LocalDateTime limitDate;
	

}
