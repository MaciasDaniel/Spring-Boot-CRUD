package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.model.Estudiante;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer>{

}