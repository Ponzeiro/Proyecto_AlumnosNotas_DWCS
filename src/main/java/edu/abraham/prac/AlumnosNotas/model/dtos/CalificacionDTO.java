package edu.abraham.prac.AlumnosNotas.model.dtos;

public record CalificacionDTO(
    Long alumnoId,
    Long asignaturaId,
    String nota
) {}
