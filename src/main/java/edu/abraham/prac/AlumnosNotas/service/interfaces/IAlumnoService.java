package edu.abraham.prac.AlumnosNotas.service.interfaces;

import edu.abraham.prac.AlumnosNotas.model.dtos.AlumnoDTO;

public interface IAlumnoService {
    
    public AlumnoDTO obtenerAlumnos(AlumnoDTO alumnoDTO);
    public AlumnoDTO obtenerAlumnosPorId(Long id);
    public AlumnoDTO crearAlumno(AlumnoDTO alumnoDTO);
    public AlumnoDTO actualizarAlumno(Long id, AlumnoDTO alumnoDTO);
    public void eliminarAlumno(Long id);

}
