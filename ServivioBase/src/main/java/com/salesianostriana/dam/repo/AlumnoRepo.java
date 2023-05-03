package com.salesianostriana.dam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.composicion.model.Alumno;

public interface AlumnoRepo extends JpaRepository<Alumno,Long>{

}
