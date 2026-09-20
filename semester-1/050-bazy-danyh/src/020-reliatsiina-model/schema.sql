-- Спільна навчальна база даних для всього блоку 5: облік оцінок студентів.
-- Синтаксис - PostgreSQL (SERIAL для автоінкременту первинного ключа).
-- Саме ці таблиці використовуються, з незначними доповненнями, у заняттях
-- 020, 040-090 і чекпоінті 100.

CREATE TABLE groups (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);

CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    birth_year INT,
    group_id INT REFERENCES groups(id)
);

CREATE TABLE subjects (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE grades (
    id SERIAL PRIMARY KEY,
    student_id INT REFERENCES students(id),
    subject_id INT REFERENCES subjects(id),
    grade INT NOT NULL CHECK (grade BETWEEN 0 AND 100),
    grade_date DATE
);
