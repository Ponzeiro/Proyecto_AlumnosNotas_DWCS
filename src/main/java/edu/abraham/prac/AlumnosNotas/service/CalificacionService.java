package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Alumno;
import edu.abraham.prac.AlumnosNotas.model.Asignatura;
import edu.abraham.prac.AlumnosNotas.model.Calificacion;
import edu.abraham.prac.AlumnosNotas.model.dtos.CalificacionDTO;
import edu.abraham.prac.AlumnosNotas.model.enums.Nota;
import edu.abraham.prac.AlumnosNotas.repository.IAlumnoRepo;
import edu.abraham.prac.AlumnosNotas.repository.IAsignaturaRepo;
import edu.abraham.prac.AlumnosNotas.repository.ICalificacionRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.ICalificacionService;


@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private ICalificacionRepo calificacionRepo;

    @Autowired
    private IAlumnoRepo alumnoRepo;

    @Autowired
    private IAsignaturaRepo asignaturaRepo;

    @Override
    public CalificacionDTO obtenerCalificaciones(CalificacionDTO calificacionDTO) {
        calificacionRepo.findAll();
        return null;
    }

    @Override
    public CalificacionDTO obtenerCalificacionPorId(Long id) {
        calificacionRepo.findById(id);
        return null;
    }

    @Override
    public CalificacionDTO crearCalificacion(CalificacionDTO calificacionDTO) {
        
    try {
        if (calificacionDTO != null) {

            Alumno alumno = alumnoRepo.findById(calificacionDTO.alumnoId())
            .orElseThrow(() -> new Exception("Alumno no encontrado"));

            Asignatura asignatura = asignaturaRepo.findById(calificacionDTO.asignaturaId())
            .orElseThrow(() -> new Exception("Asignatura no encontrada"));

            calificacionRepo.save(new Calificacion(
                alumno,
                asignatura,
                calificacionDTO.nota() != null ? Nota.fromValor(calificacionDTO.nota()) : null
            ));
            return calificacionDTO;
        } else {
            return null;
        }
    } catch (Exception e) {
        System.out.println("Error al crear la calificación: " + e.getMessage());
        return null;
        }
    }

    @Override
    public CalificacionDTO actualizarCalificacion(Long id, CalificacionDTO calificacionDTO) {
        Calificacion calificacion = calificacionRepo.findById(id).orElse(null);
        try {
            if (calificacion != null && calificacionDTO != null) {
                calificacion.setNota(Nota.fromValor(calificacionDTO.nota()));
                calificacionRepo.save(calificacion);
            }
            return calificacionDTO;
        } catch (Exception e) {
            System.out.println("Error al actualizar la calificación: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void eliminarCalificacion(Long id) {
        calificacionRepo.deleteById(id);
    }
}
