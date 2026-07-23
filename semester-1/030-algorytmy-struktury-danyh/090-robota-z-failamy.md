# Робота з файлами (basic I/O)

**Блок:** Блок 3. Структури даних та алгоритми (основи)
**Код заняття:** `030-algorytmy-struktury-danyh/090-robota-z-failamy.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
Читання/запис у текстовий файл.

## Мета заняття
- Вміти записати текст у файл через `FileWriter`
- Вміти прочитати текст із файлу через `Scanner(File)`
- Розуміти `try-with-resources` і зв'язок із винятками з минулого заняття

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Запитати групу: «Усе, що ми досі писали, зникає одразу після закриття програми. Як зберегти результат роботи програми "назавжди", щоб він був доступний і після перезапуску?» Запустити [`WriteToFile.java`](src/090-robota-z-failamy/WriteToFile.java), потім відкрити створений файл `notes.txt` у звичайному текстовому редакторі — показати, що це справжній файл на диску.

### 2. Коротка теорія (15–20 хв)
**Запис у файл через `FileWriter`:**
```java
try (FileWriter writer = new FileWriter("notes.txt")) {
    writer.write("Текст для запису\n");
} catch (IOException e) {
    System.out.println("Помилка: " + e.getMessage());
}
```

**`try-with-resources`.** Дужки одразу після `try` (`try (FileWriter writer = ...)`) — спеціальна форма, яка АВТОМАТИЧНО закриває файл після виконання блоку, навіть якщо сталася помилка. Без цього довелось би вручну писати `writer.close()` у блоці `finally` — `try-with-resources` існує саме для того, щоб не забути це зробити.

**`IOException` — checked-виняток.** На відміну від `ArithmeticException` чи `NumberFormatException` з минулого заняття, компілятор ЗМУШУЄ явно обробити `IOException` (через `catch`) або оголосити `throws IOException` у сигнатурі методу — інакше код навіть не скомпілюється. Це особлива категорія винятків, пов'язана саме з операціями, де щось "зовнішнє" (файлова система, мережа) може піти не так незалежно від коду програми.

**Читання з файлу через `Scanner`:**
```java
try (Scanner fileScanner = new Scanner(new File("notes.txt"))) {
    while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.out.println("Файл не знайдено");
}
```
Той самий `Scanner`, який студенти використовували для читання з консолі (`System.in`) від самого блоку 1 — тепер читає з файлу (`new File(...)`) практично тими самими методами.

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати [`WriteToFile.java`](src/090-robota-z-failamy/WriteToFile.java) рядок за рядком, і одразу — [`ReadFromFile.java`](src/090-robota-z-failamy/ReadFromFile.java), який читає щойно записаний файл. **Важливо для запуску:** обидва приклади працюють із файлом `notes.txt` у поточній робочій директорії — обов'язково запустити `WriteToFile.java` ПЕРШИМ, інакше `ReadFromFile.java` не знайде файл (деталі — у [`src/README.md`](src/README.md)).

### 4. Керована практика (20–30 хв)
Разом модифікувати `WriteToFile.java`, щоб він дописував (append) новий рядок до вже існуючого файлу, а не перезаписував його — підказка: другий параметр конструктора `new FileWriter("notes.txt", true)`.

### 5. Самостійна практика / челендж (20–30 хв)
Розібрати [`LineCounter.java`](src/090-robota-z-failamy/LineCounter.java) — читання файлу з підрахунком кількості рядків і слів. Челендж: додати підрахунок кількості СИМВОЛІВ (без пробілів) у файлі.

### 6. Рефлексія та підсумок (5–10 хв)
Обговорити: чому робота з файлами майже завжди вимагає обробки винятків (`IOException`, `FileNotFoundException`) — на відміну від, наприклад, арифметики? (Відповідь: файл може бути видалений, недоступний через права доступу, диск може бути переповнений — усе це поза контролем самої програми).

## Домашнє завдання (необов'язково)
Написати програму, яка зчитує список імен із файлу (по одному імені на рядок) і записує у ДРУГИЙ файл ті самі імена, але відсортовані за алфавітом (з урахуванням пастки `Collator`, розглянутої на занятті про сортування).

## Додаткові матеріали
- [Oracle Java Tutorials — Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/) (EN)
- [MOOC.fi Java Programming II](https://java-programming.mooc.fi/part-7) (EN)

## Джерела коду для цього заняття
- [`src/090-robota-z-failamy/WriteToFile.java`](src/090-robota-z-failamy/WriteToFile.java) — хук + демонстрація
- [`src/090-robota-z-failamy/ReadFromFile.java`](src/090-robota-z-failamy/ReadFromFile.java) — демонстрація + керована практика
- [`src/090-robota-z-failamy/LineCounter.java`](src/090-robota-z-failamy/LineCounter.java) — самостійний челендж
- Як запускати приклади (важливо для цього заняття) — [`src/README.md`](src/README.md)
