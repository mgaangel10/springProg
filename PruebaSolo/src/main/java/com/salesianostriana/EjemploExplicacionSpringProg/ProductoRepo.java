package com.salesianostriana.EjemploExplicacionSpringProg;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
	

}
