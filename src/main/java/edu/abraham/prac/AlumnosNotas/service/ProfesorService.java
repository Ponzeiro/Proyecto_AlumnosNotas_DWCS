package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Profesor;
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
        try {
            if (profesorDTO != null) {
                    profesorRepo.save(new Profesor(
                        profesorDTO.nombre(),
                        profesorDTO.apodo()
                    ));
                    return profesorDTO;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error al crear la calificación: " + e.getMessage());
            return null;
        }
    }

    @Override
    public ProfesorDTO actualizarProfesor(Long id, ProfesorDTO profesorDTO) {
        Profesor profesor = profesorRepo.findById(id).orElse(null);
        try {
            if (profesor != null && profesorDTO != null) {
                profesor.setNombre(profesorDTO.nombre());
                profesor.setApodo(profesorDTO.apodo());
                profesorRepo.save(profesor);
            }
            return profesorDTO;
        } catch (Exception e) {
            System.out.println("Error al actualizar el profesor: " + e.getMessage());
            return null;
        }   
    }

    @Override
    public void eliminarProfesor(Long id) {
        profesorRepo.deleteById(id);
    }

}
