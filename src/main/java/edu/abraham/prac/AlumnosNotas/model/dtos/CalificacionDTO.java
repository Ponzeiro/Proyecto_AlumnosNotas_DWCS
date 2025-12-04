package edu.abraham.prac.AlumnosNotas.model.dtos;

public record CalificacionDTO(
    Long alumnoId,
    String asignatura,
    String nota
) {}
