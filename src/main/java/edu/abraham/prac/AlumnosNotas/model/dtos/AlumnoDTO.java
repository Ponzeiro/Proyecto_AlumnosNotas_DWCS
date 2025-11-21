package edu.abraham.prac.AlumnosNotas.model.dtos;

import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;

public class AlumnoDTO {

    private Long alumno_id;
    private String nombre;
    private FechaNacimiento fecha_nacimiento;
    
    public AlumnoDTO(Long alumno_id, String nombre, FechaNacimiento fecha_nacimiento) {
        this.alumno_id = alumno_id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Long alumno_id) {
        this.alumno_id = alumno_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FechaNacimiento getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(FechaNacimiento fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "AlumnoDTO [alumno_id=" + alumno_id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento
                + "]";
    }    
}
