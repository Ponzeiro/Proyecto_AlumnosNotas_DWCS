package edu.abraham.prac.AlumnosNotas.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;
import edu.abraham.prac.AlumnosNotas.model.Calificacion;
import edu.abraham.prac.AlumnosNotas.model.dtos.CalificacionDTO;
import edu.abraham.prac.AlumnosNotas.model.enums.Nota;

@Component
public class CalificacionMapper  {

    public CalificacionDTO toDto(Calificacion calificacion) {
        Asignatura asignatura = new Asignatura(); // obtener la lista de asignaturas asociadas a la calificación
        return new CalificacionDTO(
            calificacion.getAlumno().getAlumno_id(),
            asignatura.getNombre(),
            calificacion.getNota().toValor()
        );
    }

    public Calificacion toEntity(CalificacionDTO calificacionDTO) {
        if (calificacionDTO == null) return null;
        Calificacion calificacion = new Calificacion();
        Nota nota = Nota.fromValor(calificacionDTO.nota());
        calificacion.setNota(nota);
        return calificacion;
    }
}
