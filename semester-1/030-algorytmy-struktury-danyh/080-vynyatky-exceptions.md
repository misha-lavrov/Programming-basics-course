# Обробка виключень (exceptions)

**Блок:** Блок 3. Структури даних та алгоритми (основи)
**Код заняття:** `030-algorytmy-struktury-danyh/080-vynyatky-exceptions.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
try/catch/finally, власні винятки.

## Мета заняття
- Розуміти, навіщо потрібна обробка виключень
- Вміти писати `try/catch/finally`
- Вміти створювати й використовувати власний (custom) виняток

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Запитати групу: «Пригадайте, скільки разів за цей рік ваша програма аварійно "падала" через якусь несподівану ситуацію — ділення на нуль, вихід за межі масиву, некоректний ввід користувача?» Запустити [`DivisionSafe.java`](src/080-vynyatky-exceptions/DivisionSafe.java) — показати, що ділення на 0 у цьому прикладі НЕ зупиняє всю програму, а обробляється й програма продовжує роботу.

### 2. Коротка теорія (15–20 хв)
**Що таке виняток (exception).** Виняток — сигнал про те, що під час виконання програми сталася нештатна ситуація (ділення на нуль, файл не знайдено, некоректний формат числа тощо). Без обробки виняток аварійно завершує програму на тому самому рядку.

**Синтаксис `try/catch/finally`:**
```java
try {
    int result = 100 / divisor; // код, що МОЖЕ кинути виняток
} catch (ArithmeticException e) {
    System.out.println("Помилка: " + e.getMessage()); // що робити, якщо виняток стався
} finally {
    System.out.println("Виконується завжди"); // виконується і при успіху, і при помилці
}
```
`finally` часто використовують для "прибирання" — закриття файлів, з'єднань тощо (побачимо на наступному занятті).

**Типові вбудовані винятки:** `ArithmeticException` (ділення на нуль), `ArrayIndexOutOfBoundsException` (вихід за межі масиву, з блоку 1), `NumberFormatException` (не вдалося перетворити текст на число), `NullPointerException` (звернення до `null` — детально розберемо в майбутньому, коли працюватимемо з об'єктами, які можуть бути не ініціалізовані).

**Власні (custom) винятки.** Коли вбудованих винятків недостатньо, щоб змістовно описати проблему власної програми (наприклад, «недостатньо коштів на рахунку»), можна створити власний клас винятку, успадкувавши `Exception`:
```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
```
Метод, який може кинути такий виняток, позначається `throws InsufficientFundsException` у сигнатурі — це попереджає будь-кого, хто викликає метод, що виняток треба обробити.

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати [`DivisionSafe.java`](src/080-vynyatky-exceptions/DivisionSafe.java) — цикл, що ділить на кілька чисел, включно з 0, і продовжує роботу після кожної помилки завдяки `try/catch/finally`.

### 4. Керована практика (20–30 хв)
Разом розібрати [`InputValidator.java`](src/080-vynyatky-exceptions/InputValidator.java) — обробка `NumberFormatException` при спробі перетворити довільний текст користувача на число через `Integer.parseInt()`.

### 5. Самостійна практика / челендж (20–30 хв)
Розібрати трійку [`InsufficientFundsException.java`](src/080-vynyatky-exceptions/InsufficientFundsException.java), [`BankAccountWithExceptions.java`](src/080-vynyatky-exceptions/BankAccountWithExceptions.java) і [`BankAccountExceptionDemo.java`](src/080-vynyatky-exceptions/BankAccountExceptionDemo.java) — порівняти з `BankAccount.java` з блоку 2, де недостатність коштів просто друкувалась у консоль, а не оброблялась як повноцінний виняток. Челендж: додати ще один власний виняток `InvalidAmountException` для випадку, коли сума операції від'ємна.

### 6. Рефлексія та підсумок (5–10 хв)
Обговорити: чому власний виняток `InsufficientFundsException` зрозуміліший у коді, ніж просто `if (amount > balance) { return; }` з блоку 2? (Відповідь: назва винятку сама пояснює, що сталося, і код, який викликає метод, ЗМУШЕНИЙ явно вирішити, що робити в цій ситуації, а не мовчки її ігнорувати).

## Домашнє завдання (необов'язково)
Додати до `BankAccountWithExceptions.java` перевірку від'ємної суми поповнення (`deposit()`), яка кидає ще один власний виняток `InvalidAmountException`.

## Додаткові матеріали
- [MOOC.fi Java Programming II](https://java-programming.mooc.fi/part-7) (EN) — розділ про винятки
- [W3Schools українською — Java](https://w3schoolsua.github.io/java/index.html) (UA) — розділ Exceptions

## Джерела коду для цього заняття
- [`src/080-vynyatky-exceptions/DivisionSafe.java`](src/080-vynyatky-exceptions/DivisionSafe.java) — хук + демонстрація
- [`src/080-vynyatky-exceptions/InputValidator.java`](src/080-vynyatky-exceptions/InputValidator.java) — керована практика
- [`src/080-vynyatky-exceptions/InsufficientFundsException.java`](src/080-vynyatky-exceptions/InsufficientFundsException.java), [`BankAccountWithExceptions.java`](src/080-vynyatky-exceptions/BankAccountWithExceptions.java), [`BankAccountExceptionDemo.java`](src/080-vynyatky-exceptions/BankAccountExceptionDemo.java) — самостійний челендж
- Як запускати приклади — [`src/README.md`](src/README.md)
