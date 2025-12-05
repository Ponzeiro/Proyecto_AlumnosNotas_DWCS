package edu.abraham.prac.AlumnosNotas.model.dtos;

public record AlumnoDTO(
    String nombre,
    String apellido1,
    String apellido2,
    int edad,
    int fecha_nacimiento_dia,
    int fecha_nacimiento_mes,
    int fecha_nacimiento_anho,
    int dni_numero,
    char dni_letra
){}
