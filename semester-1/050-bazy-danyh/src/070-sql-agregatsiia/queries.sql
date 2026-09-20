-- Приклади для заняття 070. Виконуються на базі даних з заняття 020.

-- COUNT - скільки всього студентів
SELECT COUNT(*) AS total_students FROM students;

-- COUNT з WHERE - скільки студентів народились у 2006
SELECT COUNT(*) AS count_2006 FROM students WHERE birth_year = 2006;

-- SUM і AVG - сума та середнє значення оцінок
SELECT SUM(grade) AS total, AVG(grade) AS average FROM grades;

-- GROUP BY - розбити рядки на групи і порахувати агрегат ОКРЕМО для кожної.
-- Середній бал КОЖНОГО студента (об'єднуємо grades зі students, щоб бачити ім'я)
SELECT s.name, AVG(gr.grade) AS average_grade
FROM grades gr
INNER JOIN students s ON gr.student_id = s.id
GROUP BY s.name
ORDER BY average_grade DESC;

-- GROUP BY по предмету - середній бал групи за КОЖЕН предмет
SELECT sub.name AS subject_name, AVG(gr.grade) AS average_grade, COUNT(*) AS grades_count
FROM grades gr
INNER JOIN subjects sub ON gr.subject_id = sub.id
GROUP BY sub.name;

-- HAVING - фільтрація ПІСЛЯ групування (WHERE тут не підійшов би, бо AVG
-- рахується вже в процесі групування, а WHERE перевіряє рядки ДО нього)
SELECT s.name, AVG(gr.grade) AS average_grade
FROM grades gr
INNER JOIN students s ON gr.student_id = s.id
GROUP BY s.name
HAVING AVG(gr.grade) >= 85;
