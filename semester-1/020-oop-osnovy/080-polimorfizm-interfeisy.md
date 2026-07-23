# Поліморфізм та інтерфейси

**Блок:** Блок 2. Методи та основи ООП
**Код заняття:** `020-oop-osnovy/080-polimorfizm-interfeisy.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
Основи interface, поліморфна поведінка.

## Мета заняття
- Розуміти інтерфейс як "контракт" — що клас має вміти, без деталей як саме
- Вміти оголошувати інтерфейс і реалізовувати його (`implements`) у кількох різних класах
- Розуміти поліморфізм: однаковий виклик методу поводиться по-різному залежно від реального типу об'єкта

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Запитати групу: «Уявіть систему нарахування зарплати, де є штатні співробітники (фіксована ставка) і контрактники (оплата за годину). Чи можна порахувати виплати ВСІМ ОДНИМ циклом, не перевіряючи щоразу, з ким саме маємо справу?» Запустити [`PayrollDemo.java`](src/080-polimorfizm-interfeisy/PayrollDemo.java) — один цикл, два зовсім різні класи всередині.

### 2. Коротка теорія (15–20 хв)
**Що таке інтерфейс.** Інтерфейс — це "контракт": він оголошує, ЩО клас, який його реалізує, зобов'язаний вміти робити, але не каже, ЯК саме:
```java
public interface Payable {
    double calculatePay();
}
```
Клас підписується під цей контракт через `implements` і сам вирішує, як саме реалізувати метод:
```java
public class Contractor implements Payable {
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
```

**Поліморфізм — головна ідея заняття.** Якщо кілька класів реалізують один і той самий інтерфейс, їх можна зберігати в одному масиві/списку ЦЬОГО типу інтерфейсу і звертатись до кожного однаково — а реальна поведінка кожного об'єкта визначиться сама, залежно від того, яким класом він насправді є:
```java
Payable[] payroll = { new FullTimeEmployee(...), new Contractor(...) };
for (Payable person : payroll) {
    System.out.println(person.calculatePay()); // код "не знає" і не мусить знати, з ким саме працює
}
```
Слово "polymorphism" буквально означає "багато форм" — один виклик `calculatePay()` набуває різної конкретної поведінки залежно від реального типу об'єкта.

**Навіщо це потрібно.** Без поліморфізму довелось би писати `if (person instanceof FullTimeEmployee) {...} else if (person instanceof Contractor) {...}` — і щоразу, додаючи новий тип співробітника, переписувати цю перевірку в кожному місці, де вона зустрічається. З інтерфейсом — досить додати новий клас, що реалізує `Payable`, і весь існуючий код, що працює через інтерфейс, підхопить його без жодних змін (це видно в самостійній практиці нижче).

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати [`Payable.java`](src/080-polimorfizm-interfeisy/Payable.java), [`FullTimeEmployee.java`](src/080-polimorfizm-interfeisy/FullTimeEmployee.java), [`Contractor.java`](src/080-polimorfizm-interfeisy/Contractor.java) і [`PayrollDemo.java`](src/080-polimorfizm-interfeisy/PayrollDemo.java) — наголосити саме на рядку `for (Payable person : payroll)`, де `person` може бути будь-яким класом, що реалізує `Payable`.

### 4. Керована практика (20–30 хв)
Разом розібрати другий приклад на той самий принцип: [`Shape.java`](src/080-polimorfizm-interfeisy/Shape.java), [`Circle.java`](src/080-polimorfizm-interfeisy/Circle.java), [`RectangleShape.java`](src/080-polimorfizm-interfeisy/RectangleShape.java), [`ShapeDemo.java`](src/080-polimorfizm-interfeisy/ShapeDemo.java) — масив різних фігур, підрахунок сумарної площі одним циклом.

### 5. Самостійна практика / челендж (20–30 хв)
Челендж: додати до `ShapeDemo.java` ще одну фігуру — трикутник, що також реалізує `Shape` — і переконатись, що жодного рядка в самому `ShapeDemo.java`, окрім додавання нового об'єкта в масив, змінювати не довелось. [`Triangle.java`](src/080-polimorfizm-interfeisy/Triangle.java) — приклад розв'язку для звірки після самостійної спроби.

### 6. Рефлексія та підсумок (5–10 хв)
Обговорити: що саме змінилось би в `PayrollDemo.java` чи `ShapeDemo.java`, якби з'явився ще один тип співробітника чи фігури? (Відповідь: нічого, окрім самого нового класу — і саме в цьому сила поліморфізму).

## Домашнє завдання (необов'язково)
Створити інтерфейс `Speaker` з методом `speak()` і реалізувати його в двох-трьох різних класах на власний вибір (не обов'язково тварини — можна персонажі гри, музичні інструменти тощо), і вивести їх поведінку через один спільний масив/цикл.

## Додаткові матеріали
- [MOOC.fi Java Programming II](https://java-programming.mooc.fi/part-7) (EN) — розділи про інтерфейси
- [Baeldung — OOP in Java](https://www.baeldung.com/java-oop) (EN) — розділ Polymorphism
- [W3Schools українською — Java ООП](https://w3schoolsua.github.io/java/java_oop.html) (UA)

## Джерела коду для цього заняття
- [`src/080-polimorfizm-interfeisy/Payable.java`](src/080-polimorfizm-interfeisy/Payable.java), [`FullTimeEmployee.java`](src/080-polimorfizm-interfeisy/FullTimeEmployee.java), [`Contractor.java`](src/080-polimorfizm-interfeisy/Contractor.java), [`PayrollDemo.java`](src/080-polimorfizm-interfeisy/PayrollDemo.java) — хук + демонстрація
- [`src/080-polimorfizm-interfeisy/Shape.java`](src/080-polimorfizm-interfeisy/Shape.java), [`Circle.java`](src/080-polimorfizm-interfeisy/Circle.java), [`RectangleShape.java`](src/080-polimorfizm-interfeisy/RectangleShape.java), [`ShapeDemo.java`](src/080-polimorfizm-interfeisy/ShapeDemo.java) — керована практика
- [`src/080-polimorfizm-interfeisy/Triangle.java`](src/080-polimorfizm-interfeisy/Triangle.java) — приклад розв'язку челенджу
- Як запускати приклади — [`src/README.md`](src/README.md)
