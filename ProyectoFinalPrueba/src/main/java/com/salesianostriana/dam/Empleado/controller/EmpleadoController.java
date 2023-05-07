package com.salesianostriana.dam.Empleado.controller;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.Empelado.model.Empleado;
import com.salesianostriana.dam.Empleado.service.EmpleadoService;

@Controller
public class EmpleadoController {
	
	private EmpleadoService emse;
	
	public EmpleadoController (EmpleadoService ser) {
		this.emse=ser;
	}
	@GetMapping({"/","/todo"})
	public String index(Model model) {
		return "index";
	}
	@GetMapping("/mostrarFormulario")
	public String Mostrar(Model model) {
		model.addAttribute("lista",emse.findAll());
		return "vistaFormularioTerminado";
	}
	@GetMapping("/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("empleado",new Empleado());
		return "vistaFormulario";
	}
	@PostMapping("/nuevo/submit")
	public String procesarFormulario(@ModelAttribute("empleado") Empleado e) {
		emse.add(e);
		return "redirect:/mostrarFormulario";
	}
	
	
	
	
	
	

	
	
	
	}
