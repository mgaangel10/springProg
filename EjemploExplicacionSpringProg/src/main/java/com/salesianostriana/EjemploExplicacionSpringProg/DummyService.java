package com.salesianostriana.EjemploExplicacionSpringProg;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class DummyService {
	
	public Producto getProducto() {
		return new Producto("camiseta","wena de verdad!",15.0f,87,91.1f);
	}
	
	public Producto getProductosSinAlgunosValores() {
		return new Producto("Otro producto", null,1.0f);
	}
	


}
