package edu.abraham.prac.AlumnosNotas.model;

import edu.abraham.prac.AlumnosNotas.model.vo.Dni;
import edu.abraham.prac.AlumnosNotas.model.vo.FechaNacimiento;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 100, nullable = false)
    private String apellido1;
    @Column(length = 100, nullable = true)
    private String apellido2;
    @Column(nullable = false)
    private int edad;
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "day", column = @Column(name = "dia", nullable = false)),
        @AttributeOverride(name = "month", column = @Column(name = "mes", nullable = false)),
        @AttributeOverride(name = "year", column = @Column(name = "anho", nullable = false))
    })
    private FechaNacimiento fechaNacimiento;
    @jakarta.persistence.Convert(converter = edu.abraham.prac.AlumnosNotas.model.converter.DniAttributeConverter.class)
    @Column(name = "dni")
    private Dni dni;

    public Alumno(Long id, String nombre, String apellido1, String apellido2, int edad, FechaNacimiento fechaNacimiento, Dni dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
        return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", dni=" + dni + "]";
    }

    
    
}
