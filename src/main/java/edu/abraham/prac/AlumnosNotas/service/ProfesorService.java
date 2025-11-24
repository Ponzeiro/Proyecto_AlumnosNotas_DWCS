package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Profesor;
import edu.abraham.prac.AlumnosNotas.repository.IProfesorRepo;

@Service
public class ProfesorService implements IProfesorService {

    @Autowired
    private IProfesorRepo profesorRepo;
     
    @Override
    public List<Profesor> ObtenerProfesores() {
        return profesorRepo.findAll();
    }

    @Override
    public Profesor ObtenerProfesorPorId(Long id) {
        return profesorRepo.findById(id).orElse(null);
    }

    @Override
    public Profesor ModificarProfesorPorId(Profesor profesor) {
        if(profesorRepo.existsById(profesor.getProfesor_id())) {
            return profesorRepo.save(profesor);
        }else {
            System.err.println("El profesor con ID " + profesor.getProfesor_id() + " no existe o no puede ser modificado.");
            return null;
        }
        
    }

    @Override
    public Profesor CrearProfesor(Profesor profesor) {
        return profesorRepo.save(profesor);
    }

    @Override
    public void EliminarProfesorPorId(Long id) {
        profesorRepo.deleteById(id);
    }

}
