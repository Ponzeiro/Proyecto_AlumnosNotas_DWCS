package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.dtos.AlumnoDTO;
import edu.abraham.prac.AlumnosNotas.repository.IAlumnoRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private IAlumnoRepo alumnoRepo;

    @Override
    public AlumnoDTO obtenerAlumnos(AlumnoDTO alumnoDTO) {
        alumnoRepo.findAll();
        return null;
    }

    @Override
    public AlumnoDTO obtenerAlumnosPorId(Long id) {
        alumnoRepo.findById(id);
        return null;
    }

    @Override
    public AlumnoDTO crearAlumno(AlumnoDTO alumnoDTO) {
        return null;
    }

    @Override
    public AlumnoDTO actualizarAlumno(Long id, AlumnoDTO alumnoDTO) {
        return null;
    }

    @Override
    public void eliminarAlumno(Long id) {
        alumnoRepo.deleteById(id);
    }



}
