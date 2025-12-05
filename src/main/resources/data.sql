-- ==========================
-- ALUMNOS
-- ==========================
-- Column names come from `Alumno` entity: alumno_id, nombre, apellido1, apellido2, edad, dia, mes, anho, dni
INSERT INTO alumnos (alumno_id, nombre, apellido1, apellido2, edad, fecha_nacimiento, dni)
VALUES
	(1, 'Abraham',  'Blanco', 'Rodriguez', 21, '2004-04-07', '34884922V'),
	(2, 'Hugo', 'Del Castillo', 'Deus', 19 , '2006-08-25', '33993166V'),
	(3, 'Pablo', 'Salgado', 'Barbeito', 19, '2006-11-27', '77596017C'),
	(4, 'Antón', 'Azarov', null, 19, '2006-09-17', '35654546S'),
	(5, 'Sergio', 'Casal', 'Rodriguez', 19, '2006-11-27', '75191840T'),
	(6, 'Diego', 'Garcia', 'Candal', 20, '2006-12-05', '71967381H'),
	(7, 'Manuel', 'Perez', 'Garcia', 21, '2004-10-31', '39104914L'),
	(8, 'Isaias', 'Quesada', 'Vilariño', 21, '2004-10-20', '13495129J');

-- ==========================
-- PROFESORES
-- ==========================
-- Columns from `Profesor` entity: profesor_id, nombre, apodo
INSERT INTO profesores (profesor_id, nombre, apodo)
VALUES
	(1, 'Monica Perez', 'Moniquiña'),
	(2, 'Manuel Rico', 'Ricoldinho'),
	(3, 'Brais Arias','LinuxBoss'),
	(4, 'Jesus Roca', 'Yisus'),
	(5, 'Francisco Carro', 'Paco');

-- ==========================
-- ASIGNATURAS
-- ==========================
-- Columns from `Asignatura` entity: asignatura_id, nombre, profesor_id
INSERT INTO asignaturas (asignatura_id, nombre, profesor_id)
VALUES
	(1, 'DIW', 1),
	(2, 'DWCS', 2),
	(3, 'DAW', 3),
	(4, 'DWCC', 4),
	(5, 'DASP', 5);

-- ==========================
-- CALIFICACIONES
-- ==========================
-- Columns from `Calificacion` entity: calificacion_id, alumno_id, asignatura_id, nota
INSERT INTO calificaciones (calificacion_id, alumno_id, asignatura_id, nota)
VALUES
	(1,1,1,6),
	(2,2,2,10),
	(3,3,3,8),
	(4,4,4,2),
	(5,5,5,9),
	(6,6,1,7),
	(7,7,2,5),
	(8,8,3,6),
	(9,1,4,3),
	(10,2,5,10);
