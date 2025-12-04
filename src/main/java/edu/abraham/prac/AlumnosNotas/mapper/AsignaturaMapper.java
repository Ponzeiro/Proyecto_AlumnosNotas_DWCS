package edu.abraham.prac.AlumnosNotas.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;
import edu.abraham.prac.AlumnosNotas.model.dtos.AsignaturaDTO;
import edu.abraham.prac.AlumnosNotas.model.dtos.ProfesorDTO;

@Component
public class AsignaturaMapper {
    @Autowired
    private  ProfesoresMapper profesoresMapper;
    
    public AsignaturaDTO toDto(Asignatura asignatura) {
        if(asignatura == null) return null;

        ProfesorDTO profesorDTO = profesoresMapper.toDto(asignatura.getProfesor());
        
        return new AsignaturaDTO(
            asignatura.getNombre(),
            profesorDTO
        );
    }

    public Asignatura toEntity(AsignaturaDTO asignaturaDTO) {
        if (asignaturaDTO == null) return null;

        Asignatura asignatura = new Asignatura();
        asignatura.setNombre(asignaturaDTO.nombre());

        asignatura.setProfesor(profesoresMapper.toEntity(asignaturaDTO.profesor()));
        return asignatura;
    }
}
