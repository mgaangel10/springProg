package com.salesianostriana.damUsario.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.damUsuario.model.Usuario;
import com.salesianostriana.damUsuario.repo.UsuarioRepo;

@Service
public class UsuarioService {
	private UsuarioRepo urepo;
	
	public UsuarioService (UsuarioRepo repo) {
	this.urepo = repo;
	}
	
	public Usuario add (Usuario u) {return urepo.save(u);}
	
	public Usuario editar(Usuario u) {return urepo.save(u);}
	
	public void eliminar(Usuario u) {urepo.delete(u);}
	
	public List<Usuario> findall(){return urepo.findAll();}
	

}
