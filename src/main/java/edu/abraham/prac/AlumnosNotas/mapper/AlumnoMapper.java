package edu.abraham.prac.AlumnosNotas.mapper;

import org.springframework.stereotype.Component;

import edu.abraham.prac.AlumnosNotas.model.Alumno;
import edu.abraham.prac.AlumnosNotas.model.dtos.AlumnoDTO;
import edu.abraham.prac.AlumnosNotas.model.vo.Dni;
import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;

@Component
public class AlumnoMapper {

    public AlumnoDTO toDto(Alumno alumno) {
        
        int dni_numero = 0;
        int dni_letra = '\0';
        if(alumno.getDni() != null) {
            if(alumno.getDni().getNumero() != null) dni_numero = alumno.getDni().getNumero();
            if(alumno.getDni().getLetra() != null) dni_letra = alumno.getDni().getLetra();
        }
        
        int dia = 0, mes = 0, anho = 0;
        if (alumno.getFechaNacimiento() != null) {
            if (alumno.getFechaNacimiento().getDia() != null) dia = alumno.getFechaNacimiento().getDia();
            if (alumno.getFechaNacimiento().getMes() != null) mes = alumno.getFechaNacimiento().getMes();
            if (alumno.getFechaNacimiento().getAnho() != null) anho = alumno.getFechaNacimiento().getAnho();
        }

        return new AlumnoDTO(
            alumno.getNombre(),
            alumno.getApellido1(),
            alumno.getEdad(),
            dia,
            mes,
            anho,
            dni_numero,
            (char) dni_letra
        );  
    }

    public Alumno toEntity(AlumnoDTO alumnoDTO) {
        if (alumnoDTO == null) return null;

        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDTO.nombre());
        alumno.setApellido1(alumnoDTO.apellido1());
        alumno.setEdad(alumnoDTO.edad());

        if (alumnoDTO.dni_numero() > 0 && alumnoDTO.dni_letra() != '\0') {
            Dni dni = new Dni(alumnoDTO.dni_numero(), alumnoDTO.dni_letra());
            alumno.setDni(dni);
        }

        if (alumnoDTO.fecha_nacimiento_dia() > 0 && alumnoDTO.fecha_nacimiento_mes() > 0 && alumnoDTO.fecha_nacimiento_anho() > 0) {
            FechaNacimiento fn = new FechaNacimiento(alumnoDTO.fecha_nacimiento_dia(), alumnoDTO.fecha_nacimiento_mes(), alumnoDTO.fecha_nacimiento_anho());
            alumno.setFechaNacimiento(fn);
        }

        return alumno;
    }   
}
