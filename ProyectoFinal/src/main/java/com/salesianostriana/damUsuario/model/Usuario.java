package com.salesianostriana.damUsuario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Usuario {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String apellidos;
	private String email;
	

}
