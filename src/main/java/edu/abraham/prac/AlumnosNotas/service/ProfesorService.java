package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.dtos.ProfesorDTO;
import edu.abraham.prac.AlumnosNotas.repository.IProfesorRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.IProfesorService;

@Service
public class ProfesorService implements IProfesorService{

    @Autowired
    private IProfesorRepo profesorRepo;

    @Override
    public ProfesorDTO obtenerProfesores(ProfesorDTO profesorDTO) {
        profesorRepo.findAll();
        return null;
    }

    @Override
    public ProfesorDTO obtenerProfesorPorId(Long id) {
        profesorRepo.findById(id);
        return null;
    }

    @Override
    public ProfesorDTO crearProfesor(ProfesorDTO profesorDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearProfesor'");
    }

    @Override
    public ProfesorDTO actualizarProfesor(Long id, ProfesorDTO profesorDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarProfesor'");
    }

    @Override
    public void eliminarProfesor(Long id) {
        profesorRepo.deleteById(id);
    }

}
