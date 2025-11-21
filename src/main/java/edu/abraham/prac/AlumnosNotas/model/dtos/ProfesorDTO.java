package edu.abraham.prac.AlumnosNotas.model.dtos;

public class ProfesorDTO {

    private Long profesor_id;
    private String nombre;

    public ProfesorDTO(Long profesor_id, String nombre) {
        this.profesor_id = profesor_id;
        this.nombre = nombre;
    }

    public Long getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(Long profesor_id) {
        this.profesor_id = profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ProfesorDTO [profesor_id=" + profesor_id + ", nombre=" + nombre + "]";
    }
}
