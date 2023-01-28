package com.app.web.studentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.model.Estudiante;
import com.app.web.repository.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

	@Autowired
	private EstudianteRepositorio repositorio;
	
	@Override
	public List<Estudiante> listarEstudiantes() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(int id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(int id) {
		repositorio.deleteById(id);
	}

}