# Java + база даних

**Блок:** Блок 5. Основи баз даних
**Код заняття:** `050-bazy-danyh/090-java-jdbc.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
Основи JDBC: підключення, запити з коду.

## Мета заняття
- Вміти підключити JDBC-драйвер PostgreSQL до проєкту
- Вміти встановити з'єднання й виконати `SELECT`-запит з Java, обробивши результат
- Розуміти небезпеку SQL-ін'єкцій і вміти уникати їх через `PreparedStatement`

## Підготовка викладача (перед заняттям)
Потрібно завантажити `.jar`-файл драйвера PostgreSQL і показати студентам, як підключити його до простого IntelliJ-проєкту без систем збірки (Maven/Gradle ще не проходили):
1. Завантажити `postgresql-*.jar` з [jdbc.postgresql.org/download](https://jdbc.postgresql.org/download/).
2. У IntelliJ IDEA: File → Project Structure → Modules → Dependencies → "+" → "JARs or directories" → обрати завантажений `.jar`.

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Запитати: «Досі ми або писали дані прямо в код (масиви, ArrayList), або читали з текстового файлу (блок 3). А як програмі на Java поговорити з базою даних, яку ми будували весь цей блок?» JDBC (Java Database Connectivity) — стандартний спосіб зробити саме це.

### 2. Коротка теорія (15–20 хв)
**Що таке JDBC.** Стандартний API (набір інтерфейсів) у самій Java (`java.sql.*`) для роботи з базами даних. Сам JDBC не "розуміє" PostgreSQL напряму — для кожної конкретної СУБД потрібен **драйвер** (окрема бібліотека, `.jar`-файл), що реалізує ці інтерфейси саме для неї.

**Основні класи/інтерфейси:**
```java
Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); // з'єднання з базою
Statement statement = connection.createStatement();  // "виконавець" запитів
ResultSet resultSet = statement.executeQuery(sql);    // результат SELECT - "курсор" по рядках
```
`URL` для PostgreSQL має вигляд `jdbc:postgresql://localhost:5432/college_db` — те саме `localhost:5432`, що вводили в DBeaver на занятті 030.

**`try-with-resources` — знову (знайоме з роботи з файлами, блок 3).** `Connection`, `Statement`, `ResultSet` усі варто закривати після використання — `try-with-resources` робить це автоматично:
```java
try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
     Statement statement = connection.createStatement();
     ResultSet resultSet = statement.executeQuery(sql)) {
    while (resultSet.next()) {
        System.out.println(resultSet.getString("name"));
    }
} catch (SQLException e) {
    System.out.println("Помилка: " + e.getMessage());
}
```

**Типова помилка новачків — забутий драйвер (перевірено на практиці).** Якщо драйвер не підключено до проєкту, спроба з'єднання видасть:
```
Помилка підключення: No suitable driver found for jdbc:postgresql://localhost:5432/college_db
```
Це не помилка синтаксису коду — це відсутність `.jar`-файлу драйвера в проєкті (крок з розділу "Підготовка викладача"). Корисно продемонструвати цю помилку навмисно, щоб студенти впізнали її самостійно в майбутньому.

**SQL-ін'єкція (SQL injection) — критично важлива тема безпеки.** Якщо будувати SQL-запит через конкатенацію рядків із введеними користувачем даними:
```java
String sql = "SELECT * FROM students WHERE name = '" + userInput + "'"; // НЕБЕЗПЕЧНО
```
зловмисник може ввести замість імені щось на кшталт `x'; DROP TABLE students; --` і виконати ДОВІЛЬНИЙ SQL-код через застосунок. `PreparedStatement` вирішує це, передаючи значення ОКРЕМО від тексту запиту через `?`-плейсхолдери — синтаксично неможливо "вирватись" за межі даних у SQL-код.

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати [`JdbcConnection.java`](src/090-java-jdbc/JdbcConnection.java) — перше підключення, і [`JdbcSelect.java`](src/090-java-jdbc/JdbcSelect.java) — виконання `SELECT` з обходом `ResultSet`. Навмисно (наприклад, тимчасово видаливши драйвер з Dependencies) показати помилку `No suitable driver found`, а потім повернути драйвер і показати успішний результат.

### 4. Керована практика (20–30 хв)
Розібрати [`JdbcPreparedStatement.java`](src/090-java-jdbc/JdbcPreparedStatement.java) — додавання нового студента через `PreparedStatement`. Обов'язково обговорити коментар у файлі про SQL-ін'єкцію — це саме той тип знання про безпеку коду, яке відрізняє професійний підхід від навчального "аби працювало".

### 5. Самостійна практика / челендж (20–30 хв)
Написати новий метод, що виконує `UPDATE` через `PreparedStatement` (наприклад, оновлення оцінки студента за `id`). Челендж: написати метод, що виконує `SELECT` із `WHERE`, параметризованим через `PreparedStatement` (наприклад, знайти всіх студентів конкретної групи, де номер групи передається як параметр методу, а не "вшитий" у текст запиту).

### 6. Рефлексія та підсумок (5–10 хв)
Обговорити: чому `PreparedStatement`, а не звичайний `Statement`, має бути стандартним вибором за замовчуванням для будь-якого запиту, що включає дані від користувача.

## Домашнє завдання (необов'язково)
Написати метод `deleteStudentById(int id)` через `PreparedStatement`, що видаляє студента за `id`, і викликати його з `main()` для перевірки.

## Додаткові матеріали
- [Oracle Java Tutorials — JDBC](https://docs.oracle.com/javase/tutorial/jdbc/) (EN)
- [PostgreSQL JDBC Driver — офіційна документація](https://jdbc.postgresql.org/documentation/) (EN)

## Джерела коду для цього заняття
- [`src/090-java-jdbc/JdbcConnection.java`](src/090-java-jdbc/JdbcConnection.java) — хук + демонстрація
- [`src/090-java-jdbc/JdbcSelect.java`](src/090-java-jdbc/JdbcSelect.java) — демонстрація SELECT
- [`src/090-java-jdbc/JdbcPreparedStatement.java`](src/090-java-jdbc/JdbcPreparedStatement.java) — керована практика + пояснення SQL-ін'єкції
- Важлива примітка про перевірку цих прикладів — [`src/README.md`](src/README.md)
