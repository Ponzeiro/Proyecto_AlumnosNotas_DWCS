package edu.abraham.prac.AlumnosNotas.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long asignatura_id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor;
    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, orphanRemoval = true) 
    private Set<Calificacion> calificaciones = new HashSet<>();

    public Asignatura(Long asignatura_id, String nombre, Profesor profesor) {
        this.asignatura_id = asignatura_id;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Asignatura() {
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
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Asignatura [asignatura_id=" + asignatura_id + ", nombre=" + nombre + ", profesor=" + profesor
                + "]";
    }

    
}
