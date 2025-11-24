-- ==========================
-- ALUMNOS
-- ==========================
-- Column names come from `Alumno` entity: alumno_id, nombre, apellido1, apellido2, edad, dia, mes, anho, dni
INSERT INTO alumnos (alumno_id, nombre, apellido1, apellido2, edad, fecha_nacimiento, dni)
VALUES
	(1, 'Juan',  'Pérez',     'Gómez',     20, '2005-03-01', '34884922V'),
	(2, 'Lucía', 'Gómez',     'Fernández', 22, '1999-12-18', '33993166V'),
	(3, 'Pedro', 'Martínez',  'López',     19, '2006-01-18', '77596017C'),
	(4, 'Sofía', 'Ramírez',   'Torres',    21, '2004-11-19', '35654546S');

-- ==========================
-- PROFESORES
-- ==========================
-- Columns from `Profesor` entity: profesor_id, nombre, apodo
INSERT INTO profesores (profesor_id, nombre, apodo)
VALUES
	(1, 'Ana Torres',   'La Profe Ana'),
	(2, 'Carlos López', 'Charlie'),
	(3, 'María Sánchez','La Sanchi');

-- ==========================
-- ASIGNATURAS
-- ==========================
-- Columns from `Asignatura` entity: asignatura_id, nombre, profesor_id
INSERT INTO asignaturas (asignatura_id, nombre, profesor_id)
VALUES
	(1, 'Matemáticas', 1),
	(2, 'Historia',    2),
	(3, 'Programación',3),
	(4, 'Física',      1);

-- ==========================
-- CALIFICACIONES
-- ==========================
-- Columns from `Calificacion` entity: calificacion_id, alumno_id, asignatura_id, nota
-- Nota is an enum (`Nota`) stored by default as ORDINAL (integer index). Use integers 0..10 (0=CERO, 8=OCHO, etc.).
INSERT INTO calificaciones (calificacion_id, alumno_id, asignatura_id, nota)
VALUES
	(1, 1, 1, 8),  -- Juan - Matemáticas -> OCHO
	(2, 1, 3, 7),  -- Juan - Programación -> SIETE
	(3, 2, 1, 9),  -- Lucía - Matemáticas -> NUEVE
	(4, 2, 2, 6),  -- Lucía - Historia -> SEIS
	(5, 3, 3, 8),  -- Pedro - Programación -> OCHO
	(6, 4, 2, 7),  -- Sofía - Historia -> SIETE
	(7, 4, 4, 6);  -- Sofía - Física -> SEIS
