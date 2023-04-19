package com.salesianostriana.dam.e01operacionesycondiciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

/*Creamos un pequeño servicio que nos dé algún producto y listado 
 * como si estuviéramos consultando una base de datos, que todavía no tenemos*/

@Service
public class DummyService {
	

	/*Método que nos proporciona una instancia de producto*/
	public Producto getProducto() {
		return new Producto("Camiseta","¡Wena de verdad!",15.0f, 87, 91.1f);
	}
	
	public Producto getProductoSinAlgunosValores() {
		return new Producto("Otro producto", null, 1.0f);
	}
	
	//Para comprobar los condicionales, se pueden quitar o poner los comentarios de 
	//los return alternativamente para ver los resultados.
	public List<Producto> getLista() {
		return Arrays.asList(
				new Producto("Producto 1", "Descripción 1", 1.0f),
				new Producto("Producto 2", "Descripción 2", 2.0f),
				new Producto("Producto 3", "Descripción 3", 3.0f)
				);
		//return null;
	}
	
	//Puede simular una búsqueda de algunos productos, 
	//cuyo resultado devolviera un mapa con uno o varios elementos encontrados
	//en nuestro ejemplo solo uno, el producto p4	
	public Map<String, Producto> getMap() {
		return Collections.singletonMap("p4", new Producto("Producto 4", "Descripción 4", 4.0f));
	}
	
	

}
