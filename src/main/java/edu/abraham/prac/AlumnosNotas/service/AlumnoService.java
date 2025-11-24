package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Alumno;
import edu.abraham.prac.AlumnosNotas.repository.IAlumnoRepo;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private IAlumnoRepo alumnoRepo;

    @Override
    public List<Alumno> ObtenerAlumnos() {
        return alumnoRepo.findAll();
    }

    @Override
    public Alumno ObtenerAlumnosPorId(Long id) {
        return alumnoRepo.findById(id).orElse(null);
    }

    @Override
    public Alumno ModificarAlumnoPorId(Alumno alumno) {
        if(alumnoRepo.existsById(alumno.getAlumno_id())){
            return alumnoRepo.save(alumno);
        } else {
            System.err.println("El alumno con ID " + alumno.getAlumno_id() + " no existe o no puede ser modificado.");
            return null;
        }
    }

    @Override
    public Alumno CrearAlumno(Alumno alumno) {
        return alumnoRepo.save(alumno);
    }

    @Override
    public void EliminarAlumnoPorId(Long id) {
        alumnoRepo.deleteById(id);
    }
    
}
