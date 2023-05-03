package com.salesianostriana.EjemploExplicacionSpringProg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Reserva {
	@Id
	@GeneratedValue
	private Long codReserva;
	private String fecha;
	private String hora;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy = "reserva", fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
	@Builder.Default
	private List<Cliente> cliente = new ArrayList<>();
	//Metodos helper
	public void addCliente(Cliente c) {
		c.setReserva(this);
		this.cliente.add(c);
	}
	public void removeCliente() {
		
	}

}
