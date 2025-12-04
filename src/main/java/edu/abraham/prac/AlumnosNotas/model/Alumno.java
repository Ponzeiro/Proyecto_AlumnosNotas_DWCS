package edu.abraham.prac.AlumnosNotas.model;


import java.util.HashSet;
import java.util.Set;

import edu.abraham.prac.AlumnosNotas.model.vo.Dni;
import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import edu.abraham.prac.AlumnosNotas.model.converter.DniAttributeConverter;
import edu.abraham.prac.AlumnosNotas.model.converter.FechaNacimientoAttributeConverter;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumno_id")
    private Long alumno_id;
    @Column(name= "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name= "apellido1", length = 100, nullable = false)
    private String apellido1;
    @Column(name= "apellido2", length = 100, nullable = true)
    private String apellido2;
    @Column(name= "edad", nullable = false)
    private int edad;
    @Convert(converter = FechaNacimientoAttributeConverter.class)
    @Column(name = "fecha_nacimiento")
    private FechaNacimiento fechaNacimiento;
    @Convert(converter = DniAttributeConverter.class)
    @Column(name = "dni")
    private Dni dni;
    @OneToMany(mappedBy = "alumno") 
    private Set<Calificacion> calificaciones = new HashSet<>();

    public Alumno() {
    }

    public Alumno(Long alumno_id, String nombre, String apellido1, String apellido2, int edad, FechaNacimiento fechaNacimiento, Dni dni) {
        this.alumno_id = alumno_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
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
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Dni getDni() {
        return dni;
    }
    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno [alumno_id=" + alumno_id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + "]";
    }

}
