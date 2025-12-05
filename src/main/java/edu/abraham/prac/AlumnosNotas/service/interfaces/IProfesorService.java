package edu.abraham.prac.AlumnosNotas.service.interfaces;

import edu.abraham.prac.AlumnosNotas.model.dtos.ProfesorDTO;

public interface IProfesorService {

    public ProfesorDTO obtenerProfesores(ProfesorDTO profesorDTO);
    public ProfesorDTO obtenerProfesorPorId(Long id);
    public ProfesorDTO crearProfesor(ProfesorDTO profesorDTO);
    public ProfesorDTO actualizarProfesor(Long id, ProfesorDTO profesorDTO);
    public void eliminarProfesor(Long id);
}
