package edu.abraham.prac.AlumnosNotas.model.dtos;

import edu.abraham.prac.AlumnosNotas.model.enums.Nota;

public class CalificacionDTO {

    private Long alumnoId;
    private Long asignaturaId;
    private Nota nota;

    public CalificacionDTO() {
    }

    public CalificacionDTO(Long alumnoId, Long asignaturaId, Nota nota) {
        this.alumnoId = alumnoId;
        this.asignaturaId = asignaturaId;
        this.nota = nota;
    }

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

    public Long getAsignaturaId() {
        return asignaturaId;
    }

    public void setAsignaturaId(Long asignaturaId) {
        this.asignaturaId = asignaturaId;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "CalificacionDTO [alumnoId=" + alumnoId + ", asignaturaId=" + asignaturaId + ", nota=" + nota + "]";
    }
}
