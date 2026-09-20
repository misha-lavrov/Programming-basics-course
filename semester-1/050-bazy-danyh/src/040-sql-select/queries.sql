-- Приклади для заняття 040. Виконуються на базі даних з заняття 020
-- (schema.sql + seed-data.sql).

-- Усі студенти
SELECT * FROM students;

-- Лише ім'я та рік народження
SELECT name, birth_year FROM students;

-- WHERE - фільтрація за умовою
SELECT name FROM students WHERE birth_year = 2006;

-- WHERE з декількома умовами
SELECT name FROM students WHERE birth_year = 2006 AND group_id = 1;

-- ORDER BY - сортування (ASC - за замовчуванням, DESC - у зворотному порядку)
SELECT name, birth_year FROM students ORDER BY birth_year DESC;

-- WHERE + ORDER BY разом (поки що в межах ОДНІЄЇ таблиці - grades;
-- об'єднання з students, щоб побачити ІМ'Я студента, буде на занятті про JOIN)
SELECT student_id, subject_id, grade FROM grades WHERE grade >= 90 ORDER BY grade DESC;

-- LIKE - пошук за частковим збігом тексту ('%' - будь-яка кількість символів)
SELECT name FROM students WHERE name LIKE 'О%';
