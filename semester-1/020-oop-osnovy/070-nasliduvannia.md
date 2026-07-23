# Наслідування (inheritance)

**Блок:** Блок 2. Методи та основи ООП
**Код заняття:** `020-oop-osnovy/070-nasliduvannia.md`
**Тривалість:** 1.5–2 год
**Статус:** 🟢 розписано детально

## Опис
extends, super, ієрархії класів.

## Мета заняття
- Розуміти ідею наслідування: спільна поведінка виноситься в базовий клас
- Вміти оголошувати клас-нащадок через `extends` і викликати батьківський конструктор через `super`
- Вміти перевизначати (override) метод батьківського класу

## Структура заняття

### 1. Хук / мотивація (5–10 хв)
Запитати групу: «Якби довелось написати класи `Dog` і `Cat`, і в обох є поле `name` і метод `eat()`, які виглядають однаково — чи варто писати їх двічі?» Запустити [`AnimalDemo.java`](src/070-nasliduvannia/AnimalDemo.java) — показати, що `eat()` викликається однаково в обох класів, хоча писали цей метод лише один раз, у спільному батьківському класі `Animal`.

### 2. Коротка теорія (15–20 хв)
**Ідея наслідування.** Якщо кілька класів мають спільні поля й поведінку, цю спільну частину виносимо в один базовий (батьківський) клас, а конкретні класи — успадковують її через `extends`, додаючи лише те, що в них особливе:
```java
public class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void eat() { System.out.println(name + " їсть."); }
    void makeSound() { System.out.println(name + " видає якийсь звук."); }
}

public class Dog extends Animal {
    Dog(String name) {
        super(name); // виклик конструктора БАТЬКІВСЬКОГО класу
    }
    @Override
    void makeSound() {
        System.out.println(name + " гавкає: Гав-гав!");
    }
}
```

**`super`.** У конструкторі `super(name)` викликає конструктор класу `Animal`, щоб не дублювати заповнення поля `name`. `super.methodName()` (без дужок конструктора) викликає оригінальну версію методу з батьківського класу — корисно, коли в перевизначеному методі хочемо ДОПОВНИТИ, а не повністю замінити батьківську поведінку (показано в прикладі `Car`).

**Перевизначення методу (`@Override`).** `Dog` і `Cat` успадковують `makeSound()` від `Animal`, але кожен переозначає його під власну поведінку. Анотація `@Override` над методом — не обов'язкова технічно, але дуже корисна: компілятор перевірить, що метод справді перевизначає щось із батьківського класу, і попередить про помилку в імені, якщо щось не збіглося.

**Термінологія "is-a".** Наслідування доцільне, коли між класами дійсно є відношення «є різновидом» (Dog **є** Animal, Manager **є** Employee). Якщо такого природного відношення немає — наслідування, ймовірно, не найкращий інструмент.

### 3. Демонстрація / live-coding (15–20 хв)
Розібрати трійку [`Animal.java`](src/070-nasliduvannia/Animal.java) + [`Dog.java`](src/070-nasliduvannia/Dog.java) + [`Cat.java`](src/070-nasliduvannia/Cat.java), запустивши [`AnimalDemo.java`](src/070-nasliduvannia/AnimalDemo.java) — показати, що `makeSound()` поводиться по-різному для `Dog` і `Cat`, а `eat()` — однаково для обох, оскільки не перевизначався.

### 4. Керована практика (20–30 хв)
Разом розібрати трійку [`Vehicle.java`](src/070-nasliduvannia/Vehicle.java) + [`Car.java`](src/070-nasliduvannia/Car.java) + [`VehicleDemo.java`](src/070-nasliduvannia/VehicleDemo.java) — з акцентом на `super(brand, maxSpeed)` у конструкторі `Car` і `super.describe()` усередині перевизначеного методу, що ДОПОВНює батьківську поведінку, а не замінює її повністю.

### 5. Самостійна практика / челендж (20–30 хв)
Розібрати й доповнити трійку [`Employee.java`](src/070-nasliduvannia/Employee.java) + [`Manager.java`](src/070-nasliduvannia/Manager.java) + [`EmployeeDemo.java`](src/070-nasliduvannia/EmployeeDemo.java) — ближчий до реального робочого коду приклад (не тварини чи машини). Челендж: додати ще один клас-нащадок `Employee`, наприклад `Intern` (стажер), із власною логікою розрахунку зарплати (наприклад, фіксована менша ставка).

### 6. Рефлексія та підсумок (5–10 хв)
Обговорити: які поля й методи в прикладах були успадковані "як є", а які — перевизначені? Чому це заощаджує код і робить його легшим для змін (зміна в `Animal.eat()` одразу стосується всіх нащадків).

## Домашнє завдання (необов'язково)
Побудувати невелику ієрархію на власний вибір (наприклад, `Shape` → `Circle`/`Square` з полем і методом `describe()`, без площі — площею займемось на наступних заняттях) із мінімум одним перевизначеним методом у кожному нащадку.

## Додаткові матеріали
- [MOOC.fi Java Programming II](https://java-programming.mooc.fi/part-7) (EN) — розділ про наслідування
- [Baeldung — OOP in Java](https://www.baeldung.com/java-oop) (EN) — розділ Inheritance
- [W3Schools українською — Java ООП](https://w3schoolsua.github.io/java/java_oop.html) (UA)

## Джерела коду для цього заняття
- [`src/070-nasliduvannia/Animal.java`](src/070-nasliduvannia/Animal.java), [`Dog.java`](src/070-nasliduvannia/Dog.java), [`Cat.java`](src/070-nasliduvannia/Cat.java), [`AnimalDemo.java`](src/070-nasliduvannia/AnimalDemo.java) — хук + демонстрація
- [`src/070-nasliduvannia/Vehicle.java`](src/070-nasliduvannia/Vehicle.java), [`Car.java`](src/070-nasliduvannia/Car.java), [`VehicleDemo.java`](src/070-nasliduvannia/VehicleDemo.java) — керована практика (super)
- [`src/070-nasliduvannia/Employee.java`](src/070-nasliduvannia/Employee.java), [`Manager.java`](src/070-nasliduvannia/Manager.java), [`EmployeeDemo.java`](src/070-nasliduvannia/EmployeeDemo.java) — самостійний челендж
- Як запускати приклади — [`src/README.md`](src/README.md)
