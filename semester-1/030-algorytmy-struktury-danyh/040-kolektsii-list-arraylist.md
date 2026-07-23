# Колекції Java: List / ArrayList

**Блок:** Блок 3. Структури даних та алгоритми (основи)
**Код заняття:** `030-algorytmy-struktury-danyh/040-kolektsii-list-arraylist.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
Детальніше про методи, порівняно з масивом.

## Мета заняття
- Поглибити знання `ArrayList` (перше знайомство було в блоці 2): `indexOf`, `contains`, `Collections.sort`
- Вміти сортувати `ArrayList` об'єктів за власним критерієм через `Comparator`
- Впевнено обирати між масивом і `ArrayList` залежно від задачі

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Нагадати заняття 030 з блоку 2 (перше знайомство з `ArrayList`). Запитати: «Пам'ятаєте, як довелось вручну писати bubble sort чи selection sort минулого заняття? А якщо для колекцій уже є ГОТОВЕ сортування?» Запустити [`ListMethods.java`](src/040-kolektsii-list-arraylist/ListMethods.java) — показати `Collections.sort()` в дії за один рядок.

### 2. Коротка теорія (15–20 хв)
**Додаткові методи `ArrayList`:**
- `list.indexOf(value)` — індекс першого входження значення, або `-1`, якщо немає.
- `list.contains(value)` — чи є значення в списку.
- `Collections.sort(list)` — сортує список "на місці", використовуючи природний порядок (числа за зростанням, рядки за алфавітом — тим самим `compareTo()`, з усіма його особливостями, розглянутими минулого заняття).
- `Collections.reverse(list)` — розвертає список.

**Сортування об'єктів за власним критерієм.** `Collections.sort()` не знає САМ, як порівнювати об'єкти власних класів (`Student`, `Book` тощо) — треба явно передати `Comparator`, який каже, ЗА ЯКИМ полем і в якому порядку порівнювати:
```java
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student first, Student second) {
        return first.grade - second.grade; // за зростанням оцінки
    }
});
```
Від'ємний результат `compare()` означає «перший елемент має йти РАНІШЕ другого».

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати [`ListMethods.java`](src/040-kolektsii-list-arraylist/ListMethods.java) — `indexOf`, `contains`, `Collections.sort`, `Collections.reverse` на прикладі списку чисел.

### 4. Керована практика (20–30 хв)
Разом розібрати [`TaskList.java`](src/040-kolektsii-list-arraylist/TaskList.java) — простий список завдань (to-do list): додавання, нумерований вивід, видалення за індексом.

### 5. Самостійна практика / челендж (20–30 хв)
Розібрати [`StudentListSorting.java`](src/040-kolektsii-list-arraylist/Student.java) — `ArrayList<Student>` із сортуванням за оцінкою через `Comparator`. Челендж: додати другий `Comparator`, що сортує студентів за ІМ'ЯМ (алфавітно, з урахуванням пастки `Collator` з минулого заняття, якщо в іменах є специфічно українські літери).

### 6. Рефлексія та підсумок (5–10 хв)
Порівняти: скільки коду знадобилось би для сортування `ArrayList<Student>` вручну (bubble sort із заняття 020, адаптований під об'єкти) проти `Collections.sort()` з `Comparator`. Висновок: розуміти, ЯК працює сортування "під капотом" (навіщо й розбирали bubble/selection sort) — важливо, але в реальному коді майже завжди користуються готовими інструментами.

## Домашнє завдання (необов'язково)
Розширити `TaskList.java`: додати спосіб позначати завдання як "виконане" без видалення (наприклад, додавши префікс "[✓] " до тексту завдання) і метод підрахунку, скільки завдань лишилось невиконаними.

## Додаткові матеріали
- [W3Schools українською — Java](https://w3schoolsua.github.io/java/index.html) (UA) — розділ ArrayList
- [MOOC.fi Java Programming II](https://java-programming.mooc.fi/part-7) (EN)

## Джерела коду для цього заняття
- [`src/040-kolektsii-list-arraylist/ListMethods.java`](src/040-kolektsii-list-arraylist/ListMethods.java) — хук + демонстрація
- [`src/040-kolektsii-list-arraylist/TaskList.java`](src/040-kolektsii-list-arraylist/TaskList.java) — керована практика
- [`src/040-kolektsii-list-arraylist/Student.java`](src/040-kolektsii-list-arraylist/Student.java) + [`StudentListSorting.java`](src/040-kolektsii-list-arraylist/StudentListSorting.java) — самостійний челендж
- Як запускати приклади — [`src/README.md`](src/README.md)
