package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import edu.abraham.prac.AlumnosNotas.model.Profesor;

public interface IProfesorService {

    public List<Profesor> ObtenerProfesores();
    public Profesor ObtenerProfesorPorId(Long id);
    public Profesor ModificarProfesorPorId(Profesor profesor);
    public Profesor CrearProfesor(Profesor profesor);
    public void EliminarProfesorPorId(Long id);
}
