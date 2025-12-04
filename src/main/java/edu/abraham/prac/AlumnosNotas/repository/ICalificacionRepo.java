package edu.abraham.prac.AlumnosNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.abraham.prac.AlumnosNotas.model.Calificacion;

@Repository
public interface ICalificacionRepo extends JpaRepository<Calificacion, Long> {
    @Query("SELECT c FROM Calificacion c JOIN FETCH c.alumno JOIN FETCH c.asignatura")
    List<Calificacion> findAllWithAlumnoAndAsignatura();

    @Query("SELECT c FROM Calificacion c JOIN FETCH c.asignatura WHERE c.asignatura.asignatura_id = :id")
    List<Calificacion> findByAsignaturaIdWithAlumno(Long asignatura_id);
}
