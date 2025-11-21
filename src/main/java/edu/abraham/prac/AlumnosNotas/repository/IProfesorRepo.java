package edu.abraham.prac.AlumnosNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.abraham.prac.AlumnosNotas.model.Profesor;

public interface IProfesorRepo extends JpaRepository<Profesor, Long> {

}
