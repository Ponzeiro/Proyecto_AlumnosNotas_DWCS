package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Calificacion;
import edu.abraham.prac.AlumnosNotas.repository.ICalificacionRepo;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private ICalificacionRepo calificacionRepo;

    @Override
    public List<Calificacion> ObtenerCalificaciones() { 
        return calificacionRepo.findAll();
    }

    @Override
    public Calificacion ObtenerCalificacionPorId(Long id) {
        return calificacionRepo.findById(id).orElse(null);
    }

    @Override
    public Calificacion ModificarCalificacionPorId(Calificacion calificacion) {
        if(calificacionRepo.existsById(calificacion.getCalificacion_id())){
            return calificacionRepo.save(calificacion);
        } else {
            System.err.println("La calificación con ID " + calificacion.getCalificacion_id() + " no existe o no puede ser modificada.");
            return null;
        }
    }

    @Override
    public Calificacion CrearCalificacion(Calificacion calificacion) {
        return calificacionRepo.save(calificacion);
    }

    @Override
    public void EliminarCalificacionPorId(Long id) {
        calificacionRepo.deleteById(id);
    }

}
