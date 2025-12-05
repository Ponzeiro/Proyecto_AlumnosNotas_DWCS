package edu.abraham.prac.AlumnosNotas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.abraham.prac.AlumnosNotas.model.Alumno;
import edu.abraham.prac.AlumnosNotas.model.dtos.AlumnoDTO;
import edu.abraham.prac.AlumnosNotas.model.vo.Dni;
import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;
import edu.abraham.prac.AlumnosNotas.repository.IAlumnoRepo;
import edu.abraham.prac.AlumnosNotas.service.interfaces.IAlumnoService;

@Service
public class AlumnoService implements IAlumnoService {

    @Autowired
    private IAlumnoRepo alumnoRepo;

    @Override
    public AlumnoDTO obtenerAlumnos(AlumnoDTO alumnoDTO) {
        alumnoRepo.findAll();
        return null;
    }

    @Override
    public AlumnoDTO obtenerAlumnosPorId(Long id) {
        alumnoRepo.findById(id);
        return null;
    }

    @Override
    public AlumnoDTO crearAlumno(AlumnoDTO alumnoDTO) {
        try {
            if(alumnoDTO != null) {
                alumnoRepo.save(new Alumno(
                    alumnoDTO.nombre(),
                    alumnoDTO.apellido1(),
                    alumnoDTO.apellido2(),
                    alumnoDTO.edad(),
                    new FechaNacimiento(
                        alumnoDTO.fecha_nacimiento_dia(),
                        alumnoDTO.fecha_nacimiento_mes(),
                        alumnoDTO.fecha_nacimiento_anho()
                    ),
                    new Dni(
                        alumnoDTO.dni_numero(),
                        alumnoDTO.dni_letra()
                    )
                ));
                return alumnoDTO;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error al crear el alumno: " + e.getMessage());
            return null;
        }
    }

    @Override
    public AlumnoDTO actualizarAlumno(Long id, AlumnoDTO alumnoDTO) {
        try {
            Alumno alumno = alumnoRepo.findById(id).orElse(null);
            if (alumno != null && alumnoDTO != null) {
                alumno.setNombre(alumnoDTO.nombre());
                alumno.setApellido1(alumnoDTO.apellido1());
                alumno.setApellido2(alumnoDTO.apellido2());
                alumno.setEdad(alumnoDTO.edad());
                alumno.setFechaNacimiento(new FechaNacimiento(
                    alumnoDTO.fecha_nacimiento_dia(),
                    alumnoDTO.fecha_nacimiento_mes(),
                    alumnoDTO.fecha_nacimiento_anho()));
                alumno.setDni(new Dni(
                    alumnoDTO.dni_numero(),
                    alumnoDTO.dni_letra()
                ));
                alumnoRepo.save(alumno);   
            }
            return alumnoDTO;
        } catch (Exception e) {
            System.out.println("Error al actualizar el alumno: " + e.getMessage());
            return null;
        }
        
    }

    @Override
    public void eliminarAlumno(Long id) {
        alumnoRepo.deleteById(id);
    }
}
