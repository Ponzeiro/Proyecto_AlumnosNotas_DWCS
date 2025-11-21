package edu.abraham.prac.AlumnosNotas.model;

import edu.abraham.prac.AlumnosNotas.model.enums.Nota;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

    private Alumno alumno_id;

    private Asignatura asignatura_id;
    private Nota nota;
    
    public Calificacion(Alumno alumno_id, Asignatura asignatura_id, Nota nota) {
        this.alumno_id = alumno_id;
        this.asignatura_id = asignatura_id;
        this.nota = nota;
    }

    public Calificacion() {
    }

    public Alumno getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(Alumno alumno_id) {
        this.alumno_id = alumno_id;
    }

    public Asignatura getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(Asignatura asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Calificacion [alumno_id=" + alumno_id + ", asignatura_id=" + asignatura_id + ", nota=" + nota + "]";
    }


}
