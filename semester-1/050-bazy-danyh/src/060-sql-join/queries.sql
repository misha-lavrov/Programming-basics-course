-- Приклади для заняття 060. Виконуються на базі даних з заняття 020.

-- INNER JOIN - об'єднати students і groups за спільним полем group_id/id.
-- Показує ЛИШЕ студентів, у яких є відповідна група (тут - усі, бо group_id
-- обов'язкове для кожного студента в наших тестових даних).
SELECT students.name, groups.name AS group_name
FROM students
INNER JOIN groups ON students.group_id = groups.id;

-- Той самий JOIN, але з псевдонімами (aliases) таблиць - зручніше при довгих іменах
SELECT s.name, g.name AS group_name
FROM students s
INNER JOIN groups g ON s.group_id = g.id;

-- JOIN трьох таблиць одразу - оцінки студентів з назвами предметів
SELECT s.name AS student_name, sub.name AS subject_name, gr.grade
FROM grades gr
INNER JOIN students s ON gr.student_id = s.id
INNER JOIN subjects sub ON gr.subject_id = sub.id
ORDER BY s.name, sub.name;

-- LEFT JOIN - показує УСІХ студентів, навіть якщо в них ще НЕМАЄ жодної оцінки.
-- INNER JOIN тут "загубив" би Дмитра Савченка повністю (в нього ще немає
-- жодної оцінки) - LEFT JOIN зберігає його рядок, підставляючи NULL.
SELECT s.name, sub.name AS subject_name, gr.grade
FROM students s
LEFT JOIN grades gr ON s.id = gr.student_id
LEFT JOIN subjects sub ON gr.subject_id = sub.id
ORDER BY s.name;
