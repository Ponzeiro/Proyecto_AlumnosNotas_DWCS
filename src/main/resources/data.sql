-- ==========================
-- ALUMNOS
-- ==========================
INSERT INTO alumno (alumno_id, nombre, apellido1, apellido2, edad, fecha_nacimiento, dni)
VALUES
(1, 'Juan', 'Pérez','Gómez', 20, '2005-03-12', '12345678A'),
(2, 'Lucía', 'Gómez','Fernández', 22, '2003-07-25', '87654321B'),
(3, 'Pedro', 'Martínez', 'López', 19, '2006-01-08', '45678912C'),
(4, 'Sofía', 'Ramírez', 'Torres', 21, '2004-11-19', '14725836D');

-- ==========================
-- PROFESORES
-- ==========================
INSERT INTO profesor (profesor_id, nombre, apodo)
VALUES
(1, 'Ana Torres', 'La Profe Ana'),
(2, 'Carlos López', 'Charlie'),
(3, 'María Sánchez', 'La Sanchi');

-- ==========================
-- ASIGNATURAS
-- ==========================
INSERT INTO asignatura (asignatura_id, nombre, profesor_id)
VALUES
(1, 'Matemáticas', 1),
(2, 'Historia', 2),
(3, 'Programación', 3),
(4, 'Física', 1);

-- ==========================
-- CALIFICACIONES
-- ==========================
INSERT INTO calificacion (calificacion_id, alumno_id, asignatura_id, nota)
VALUES
(1, 1, 1, 8.5),
(2, 1, 3, 7.0),
(3, 2, 1, 9.2),
(4, 2, 2, 6.8),
(5, 3, 3, 8.0),
(6, 4, 2, 7.5),
(7, 4, 4, 6.9);
