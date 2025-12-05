package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.dtos.CalificacionDTO;
import edu.abraham.prac.AlumnosNotas.repository.ICalificacionRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.ICalificacionService;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private ICalificacionRepo calificacionRepo;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCalificacion'");
    }

    @Override
    public CalificacionDTO actualizarCalificacion(Long id, CalificacionDTO calificacionDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarCalificacion'");
    }

    @Override
    public void eliminarCalificacion(Long id) {
        calificacionRepo.deleteById(id);
    }
}
