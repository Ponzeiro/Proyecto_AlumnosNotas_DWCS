package edu.abraham.prac.AlumnosNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.abraham.prac.AlumnosNotas.model.Profesor;

@Repository
public interface IProfesorRepo extends JpaRepository<Profesor, Long> {
    @Query("SELECT p FROM Profesor p LEFT JOIN FETCH p.asignaturas WHERE p.profesor_id = :id")
    Profesor findByIdConAsignaturas(@Param("id") Long id);

}
