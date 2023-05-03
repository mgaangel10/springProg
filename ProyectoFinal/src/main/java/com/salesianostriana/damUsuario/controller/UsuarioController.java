package com.salesianostriana.damUsuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.damUsuario.model.Usuario;


@Controller
public class UsuarioController {
	
	@GetMapping ("/Administrador")
	public String Formulario(Model model) {
		Usuario u = new Usuario ();
		model.addAttribute("usuarioFormulario",u);
		return "vistaFormulario";
	}
	@PostMapping("/añadirUsuario")
	public String enviado (@ModelAttribute("usuarioFormulario") Usuario u,Model model) {
		model.addAttribute("usuario",u);
		return "vistaFormularioTerminado";
	}

}
