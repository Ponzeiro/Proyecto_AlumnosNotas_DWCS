package edu.abraham.prac.AlumnosNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.abraham.prac.AlumnosNotas.model.Alumno;

public interface IAlumnoRepo extends JpaRepository<Alumno, Long> {

}
