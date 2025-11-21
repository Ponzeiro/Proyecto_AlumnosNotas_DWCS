package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.abraham.prac.AlumnosNotas.model.Profesor;
import edu.abraham.prac.AlumnosNotas.repository.IProfesorRepo;

public class ProfesorService implements IProfesorService {

    @Autowired
    private IProfesorRepo profesorRepo;
     
    @Override
    public List<Profesor> ObtenerProfesores() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ObtenerProfesores'");
    }

    @Override
    public Profesor ObtenerProfesorPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ObtenerProfesorPorId'");
    }

    @Override
    public Profesor ModificarProfesorPorId(Profesor profesor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ModificarProfesorPorId'");
    }

    @Override
    public Profesor CrearProfesor(Profesor profesor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CrearProfesor'");
    }

    @Override
    public void EliminarProfesorPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarProfesorPorId'");
    }

}
