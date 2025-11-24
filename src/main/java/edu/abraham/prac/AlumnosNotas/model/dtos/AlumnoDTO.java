package edu.abraham.prac.AlumnosNotas.model.dtos;

import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;

public class AlumnoDTO{

    private Long alumno_id;
    private String nombre;
    private FechaNacimiento fechaNacimiento;
    
    public AlumnoDTO(Long alumno_id, String nombre, FechaNacimiento fechaNacimiento) {
        this.alumno_id = alumno_id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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
        return fechaNacimiento;
    }

    public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "AlumnoDTO [alumno_id=" + alumno_id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
                + "]";
    }    
}
