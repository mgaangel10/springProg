package com.salesianostriana.damUsuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.damUsario.service.UsuarioService;
import com.salesianostriana.damUsuario.model.Usuario;


@Controller
public class UsuarioController {
	
	private UsuarioService user;
	
	public UsuarioController(UsuarioService service) {
		this.user=service;
	}
	
	@GetMapping ({"/","VistaFormulario"})
	public String ListarUsuarios(Model model) {
		Usuario u = new Usuario ();
		model.addAttribute("lista",user.findall());
		return "index";
	}
	@PostMapping("/añadirUsuario")
	public String enviado (@ModelAttribute("usuarioFormulario") Usuario u,Model model) {
		model.addAttribute("usuario",u);
		return "VistaFormulario";
	}
	

}
