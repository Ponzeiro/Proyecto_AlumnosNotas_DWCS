package edu.abraham.prac.AlumnosNotas.mapper;

import org.springframework.stereotype.Component;

import edu.abraham.prac.AlumnosNotas.model.Profesor;
import edu.abraham.prac.AlumnosNotas.model.dtos.ProfesorDTO;

@Component
public class ProfesoresMapper {

    public ProfesorDTO toDto(Profesor profesor) {
        return new ProfesorDTO(
            profesor.getNombre()
        );
    }

    public Profesor toEntity(ProfesorDTO profesorDTO) {
        if (profesorDTO == null) return null;
        Profesor profesor = new Profesor();
        profesor.setNombre(profesorDTO.nombre());
        return profesor;
    }
}
