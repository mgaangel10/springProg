package com.salesianostriana.damUsuario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.damUsuario.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario,Long>{

}
