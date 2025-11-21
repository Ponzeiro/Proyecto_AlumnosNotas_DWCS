package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;

public interface IAsignaturaService {
    public List<Asignatura> ObtenerAsignaturas();
    public Asignatura ObtenerAsignaturaPorId(Long id);
    public Asignatura ModificarAsignaturaPorId(Asignatura asignatura);
    public Asignatura CrearAsignatura(Asignatura asignatura);
    public void EliminarAsignaturaPorId(Long id);
}
