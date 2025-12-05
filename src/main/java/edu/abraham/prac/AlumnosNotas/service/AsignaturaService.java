package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.dtos.AsignaturaDTO;
import edu.abraham.prac.AlumnosNotas.repository.IAsignaturaRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.IAsignaturaService;
import edu.abraham.prac.AlumnosNotas.model.Asignatura;

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
        try {
            if (asignaturaDTO != null) {
                asignaturaRepo.save(new Asignatura(
                    asignaturaDTO.nombre(),
                    null
                ));
                return asignaturaDTO;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error al crear la asignatura: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminarAsignatura(Long id) {
        asignaturaRepo.deleteById(id);
    }
}
