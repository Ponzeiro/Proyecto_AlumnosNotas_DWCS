package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.dtos.AsignaturaDTO;
import edu.abraham.prac.AlumnosNotas.repository.IAsignaturaRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.IAsignaturaService;

@Service
public class AsignaturaService implements IAsignaturaService {
    
    @Autowired
    private IAsignaturaRepo asignaturaRepo;

    @Override
    public AsignaturaDTO obtenerAsignaturas(AsignaturaDTO asignaturaDTO) {
        asignaturaRepo.findAll();
        return null;
    }

    @Override
    public AsignaturaDTO obtenerAsignaturaPorId(Long id) {
        asignaturaRepo.findById(id);
        return null;
    }

    @Override
    public AsignaturaDTO crearAsignatura(AsignaturaDTO asignaturaDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAsignatura'");
    }

    @Override
    public AsignaturaDTO actualizarAsignatura(Long id, AsignaturaDTO asignaturaDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarAsignatura'");
    }

    @Override
    public void eliminarAsignatura(Long id) {
        asignaturaRepo.deleteById(id);
    }
    

}
