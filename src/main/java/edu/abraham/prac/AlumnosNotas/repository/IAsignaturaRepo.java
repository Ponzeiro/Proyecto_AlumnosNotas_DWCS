package edu.abraham.prac.AlumnosNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.abraham.prac.AlumnosNotas.model.Asignatura;

public interface IAsignaturaRepo extends JpaRepository<Asignatura, Long>{

}
