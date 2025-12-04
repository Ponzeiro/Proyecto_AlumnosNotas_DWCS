package edu.abraham.prac.AlumnosNotas;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//import edu.abraham.prac.AlumnosNotas.service.AsignaturaService;
//import edu.abraham.prac.AlumnosNotas.service.CalificacionService;
//import edu.abraham.prac.AlumnosNotas.service.ProfesorService;

@SpringBootApplication
public class AlumnosNotasApplication  {

	public static void main(String[] args) {
		SpringApplication.run(AlumnosNotasApplication.class, args);

	}
/* 
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
System.out.println(profesorService.ObtenerProfesorPorId(1L).toString());
	}
	
	*/
}
