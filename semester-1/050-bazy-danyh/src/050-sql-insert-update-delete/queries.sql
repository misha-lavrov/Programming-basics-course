-- Приклади для заняття 050. Виконуються на базі даних з заняття 020.

-- INSERT - додати нового студента
INSERT INTO students (name, birth_year, group_id) VALUES ('Тарас Гончар', 2006, 2);

-- UPDATE - змінити існуючий запис. ЗАВЖДИ з WHERE, інакше зміниться КОЖЕН рядок!
UPDATE students SET group_id = 1 WHERE name = 'Тарас Гончар';

-- UPDATE кількох полів одразу
UPDATE students SET birth_year = 2005, group_id = 2 WHERE name = 'Тарас Гончар';

-- DELETE - видалити запис. Так само ЗАВЖДИ з WHERE!
DELETE FROM students WHERE name = 'Тарас Гончар';

-- Перевірка "небезпечного" UPDATE без WHERE (НЕ виконувати на реальних даних -
-- цей рядок навмисно для демонстрації на окремій тестовій копії бази)
-- UPDATE students SET group_id = 1;
