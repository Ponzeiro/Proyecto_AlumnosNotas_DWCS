package edu.abraham.prac.AlumnosNotas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.abraham.prac.AlumnosNotas.service.AlumnoService;
import edu.abraham.prac.AlumnosNotas.service.AsignaturaService;
import edu.abraham.prac.AlumnosNotas.service.CalificacionService;
import edu.abraham.prac.AlumnosNotas.service.ProfesorService;

@SpringBootApplication
public class AlumnosNotasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AlumnosNotasApplication.class, args);

	}

	@Autowired
	private AlumnoService alumnoService;

	@Autowired
	private CalificacionService calificacionService;

	@Autowired
	private AsignaturaService asignaturaService;

	@Autowired
	private ProfesorService profesorService;

	@Override
	public void run(String... args) throws Exception {

		alumnoService.ObtenerAlumnos().forEach(System.out::println);
	}
}
