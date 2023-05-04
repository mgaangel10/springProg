package com.salesianostriana.dam.Empleado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.Empelado.model.Empleado;
import com.salesianostriana.dam.Empleado.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	private EmpleadoService emse;
	
	public EmpleadoController (EmpleadoService ser) {
		this.emse=ser;
	}
	@GetMapping({"/","/todo"})
	public String Mostrar(Model model) {
		Empleado e=new Empleado();
		model.addAttribute("lista",emse.findAll());
		return "index";
	}
	
	public String mostrarFormulario(Model model) {
		model.addAttribute("empleado",new Empleado());
		return "Formulario";
	}
	
	
	}
