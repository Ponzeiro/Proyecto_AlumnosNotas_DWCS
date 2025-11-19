package edu.abraham.prac.AlumnosNotas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asignatura_id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor_id;

    public Asignatura(Long asignatura_id, String nombre, Profesor profesor_id) {
        this.asignatura_id = asignatura_id;
        this.nombre = nombre;
        this.profesor_id = profesor_id;
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
    public Profesor getProfesor_id() {
        return profesor_id;
    }
    public void setProfesor_id(Profesor profesor_id) {
        this.profesor_id = profesor_id;
    }

    @Override
    public String toString() {
        return "Asignatura [asignatura_id=" + asignatura_id + ", nombre=" + nombre + ", profesor_id=" + profesor_id
                + "]";
    }

    
}
