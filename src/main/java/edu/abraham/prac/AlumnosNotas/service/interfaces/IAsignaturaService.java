package edu.abraham.prac.AlumnosNotas.service.interfaces;

import edu.abraham.prac.AlumnosNotas.model.dtos.AsignaturaDTO;

public interface IAsignaturaService {

    public AsignaturaDTO obtenerAsignaturas(AsignaturaDTO asignaturaDTO);
    public AsignaturaDTO obtenerAsignaturaPorId(Long id);
    public AsignaturaDTO crearAsignatura(AsignaturaDTO asignaturaDTO);
    public void eliminarAsignatura(Long id);
}
