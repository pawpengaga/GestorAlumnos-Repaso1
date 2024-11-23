-- Modelo de datos

CREATE TABLE public.alumnos(
    id serial NOT NULL,
    nombre character varying(100),
    curso character varying(50),
    promedio double precision,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.alumnos
    OWNER to postgres;

-- Inserciones para pruebas

INSERT INTO public.alumnos (nombre, curso, promedio)
VALUES
('Matías Soto', 'Matemáticas', 5.6),
('Camila Torres', 'Historia', 6.8),
('Joaquín Pérez', 'Biología', 4.9),
('Antonia Rojas', 'Química', 5.3),
('Sofía Díaz', 'Lenguaje', 6.1),
('Benjamín González', 'Matemáticas', 4.8),
('Valentina Morales', 'Historia', 6.4),
('Agustín Castillo', 'Física', 5.2),
('Martina Herrera', 'Lenguaje', 7.0),
('Sebastián Ramírez', 'Química', 5.9),
('Florencia Araya', 'Historia', 4.6),
('Isidora Fuentes', 'Biología', 6.5),
('Tomás Medina', 'Matemáticas', 5.0),
('Josefa Núñez', 'Física', 6.2),
('Emilia Vega', 'Lenguaje', 5.7),
('Nicolás Carrasco', 'Química', 4.5),
('Ignacio Gutiérrez', 'Historia', 5.8),
('Catalina Paredes', 'Biología', 6.9),
('Francisca Espinoza', 'Física', 5.4),
('Maximiliano Álvarez', 'Matemáticas', 6.0);