package com.salesianostriana.dam.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.service.AlumnoService;

@Controller
public class AlumnoControlador {
	@Autowired
	private AlumnoService alumnoS;
	
	@GetMapping("/list")
	public String lista(Model model) {
		model.addAttribute("alumnos", alumnoS.findAll());
		return "lista";
	}

}
