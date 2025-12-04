package edu.abraham.prac.AlumnosNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;

@Repository
public interface IAsignaturaRepo extends JpaRepository<Asignatura, Long>{
    @Query("SELECT a FROM Asignatura a JOIN FETCH a.profesor")
    List<Asignatura> findAllWithProfesores();
    
}
