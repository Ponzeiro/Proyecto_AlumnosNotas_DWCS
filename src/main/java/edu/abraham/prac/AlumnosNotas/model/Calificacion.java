package edu.abraham.prac.AlumnosNotas.model;

import edu.abraham.prac.AlumnosNotas.model.enums.Nota;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calificacion_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alumno_id", nullable = false)
    private Alumno alumno;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asignatura_id", nullable = false)
    private Asignatura asignatura;
    @Column(nullable = true)
    private Nota nota;
    
    public Calificacion(Long calificacion_id, Alumno alumno, Asignatura asignatura, Nota nota) {
        this.calificacion_id = calificacion_id;
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public Calificacion() {
    }

    public Long getCalificacion_id() {
        return calificacion_id;
    }

    public void setCalificacion_id(Long calificacion_id) {
        this.calificacion_id = calificacion_id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Calificacion [calificacion_id=" + calificacion_id + ", alumno=" + alumno + ", asignatura="
                + asignatura + ", nota=" + nota + "]";
    }
}
