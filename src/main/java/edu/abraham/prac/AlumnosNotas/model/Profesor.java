package edu.abraham.prac.AlumnosNotas.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profesor_id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = true)
    private String apodo;
    
    @OneToMany(mappedBy = "profesor_id", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Asignatura> asignaturas;

    public Profesor(Long profesor_id, String nombre, String apodo) {
        this.profesor_id = profesor_id;
        this.nombre = nombre;
        this.apodo = apodo;
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
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Profesor [profesor_id=" + profesor_id + ", nombre=" + nombre + ", apodo=" + apodo + "]";
    }

}
