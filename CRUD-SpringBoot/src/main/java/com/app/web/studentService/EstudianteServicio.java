package com.app.web.studentService;

import java.util.List;

import com.app.web.model.Estudiante;

public interface EstudianteServicio {

	public List<Estudiante> listarEstudiantes();

	public Estudiante guardarEstudiante(Estudiante estudiante);

	public Estudiante obtenerEstudiantePorId(int id);

	public Estudiante actualizarEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(int id);
}