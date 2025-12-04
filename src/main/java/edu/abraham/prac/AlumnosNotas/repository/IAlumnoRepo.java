package edu.abraham.prac.AlumnosNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.abraham.prac.AlumnosNotas.model.Alumno;

@Repository
public interface IAlumnoRepo extends JpaRepository<Alumno, Long> {
    @Query("SELECT a FROM Alumno a JOIN FETCH a.calificaciones")
    List<Alumno> findAllWithCalificaciones();
}
