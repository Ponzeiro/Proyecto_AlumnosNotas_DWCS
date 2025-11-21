package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import edu.abraham.prac.AlumnosNotas.model.Calificacion;

public interface ICalificacionService {

    public List<Calificacion> ObtenerCalificaciones();
    public Calificacion ObtenerCalificacionPorId(Long id);
    public Calificacion ModificarCalificacionPorId(Calificacion calificacion);
    public Calificacion CrearCalificacion(Calificacion calificacion);
    public void EliminarCalificacionPorId(Long id);
}
