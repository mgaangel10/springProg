package com.salesianostriana.EjemploExplicacionSpringProg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {

	@GetMapping ("welcome")
	public String welcome(@RequestParam(name="nombre", required=false, defaultValue= "Mundo") String
			nombre, Model model) {
		model.addAttribute("nombre", nombre);
		return "index";
		
	}
	
	@GetMapping("/saludo2")
	public String welcome2 (Model model) {
		//ahora es al reves el nombre de la variable es entre comillas ("persona") no sin comillas como en eclipse CUIDADO!!
		model.addAttribute("persona",new Persona("angel","perez alvarez"));
		//esto es igual se pone comillas para nombrar el nombre del html 
		return "SaludoPersonalizado";
	}
	
	@GetMapping("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo","hola mundo");
		model.addAttribute("mensaje","se me esta haciendo largo el proyecto final final");
		model.addAttribute("url", "https://triana.salesianos.edu");
		
		return "SaludoYEnlace";
	}
	
}
