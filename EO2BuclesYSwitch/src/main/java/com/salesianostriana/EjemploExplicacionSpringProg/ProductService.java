package com.salesianostriana.EjemploExplicacionSpringProg;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	 public List<Product> getLista(){
		 return Arrays.asList(
				 new Product(1,"botijo","enfria1",20.50055,true,LocalDateTime.now()),
				 new Product(2,"botijo2","enfria2",10.5,false,LocalDateTime.now()));
	 }
}
