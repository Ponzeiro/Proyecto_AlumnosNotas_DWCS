package edu.abraham.prac.AlumnosNotas.model.dtos;

public class AsignaturaDTO {

    private Long asignatura_id;
    private String nombre;
    
    public AsignaturaDTO(Long asignatura_id, String nombre) {
        this.asignatura_id = asignatura_id;
        this.nombre = nombre;
    }

    public Long getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Long asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "AsignaturaDTO [asignatura_id=" + asignatura_id + ", nombre=" + nombre + "]";
    }
}
