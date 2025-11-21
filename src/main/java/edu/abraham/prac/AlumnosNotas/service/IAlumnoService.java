package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import edu.abraham.prac.AlumnosNotas.model.Alumno;

public interface IAlumnoService {
    public List<Alumno> ObtenerAlumnos();
    public Alumno ObtenerAlumnosPorId(Long id);
    public Alumno ModificarAlumnoPorId(Alumno alumno);
    public Alumno CrearAlumno(Alumno alumno);
    public void EliminarAlumnoPorId(Long id);
}
