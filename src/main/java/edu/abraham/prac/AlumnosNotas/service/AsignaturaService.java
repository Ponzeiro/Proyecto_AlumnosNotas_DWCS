package edu.abraham.prac.AlumnosNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;
import edu.abraham.prac.AlumnosNotas.repository.IAsignaturaRepo;

@Service
public class AsignaturaService implements IAsignaturaService {

    @Autowired
    private IAsignaturaRepo asignaturaRepo;

    @Override
    public List<Asignatura> ObtenerAsignaturas() {
        return asignaturaRepo.findAll();
    }

    @Override
    public Asignatura ObtenerAsignaturaPorId(Long id) {
        return asignaturaRepo.findById(id).orElse(null);
    }

    @Override
    public Asignatura ModificarAsignaturaPorId(Asignatura asignatura) {
        if(asignaturaRepo.existsById(asignatura.getAsignatura_id())){
            return asignaturaRepo.save(asignatura);
        } else {
            System.err.println("La asignatura con ID " + asignatura.getAsignatura_id() + " no existe o no puede ser modificada.");
            return null;
        }
    }
    @Override
    public Asignatura CrearAsignatura(Asignatura asignatura) {
        return asignaturaRepo.save(asignatura);
    }

    @Override
    public void EliminarAsignaturaPorId(Long id) {
        asignaturaRepo.deleteById(id);
    }

}
