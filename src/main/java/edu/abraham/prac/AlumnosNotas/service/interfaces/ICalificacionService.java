package edu.abraham.prac.AlumnosNotas.service.interfaces;

import edu.abraham.prac.AlumnosNotas.model.dtos.CalificacionDTO;

public interface ICalificacionService {

    public CalificacionDTO obtenerCalificaciones(CalificacionDTO calificacionDTO);
    public CalificacionDTO obtenerCalificacionPorId(Long id);
    public CalificacionDTO crearCalificacion(CalificacionDTO calificacionDTO);
    public CalificacionDTO actualizarCalificacion(Long id, CalificacionDTO calificacionDTO);
    public void eliminarCalificacion(Long id);
    
}
