// Керована практика: перевантаження конструкторів (constructor overloading) -
// кілька конструкторів з різним набором параметрів, як і з методами раніше.

public class Book {
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Другий конструктор: якщо кількість сторінок ще невідома,
    // ставимо значення за замовчуванням.
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }
}
