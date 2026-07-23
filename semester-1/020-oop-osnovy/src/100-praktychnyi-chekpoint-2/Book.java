// ПРИКЛАД РОЗВ'ЯЗКУ ДЛЯ ВИКЛАДАЧА - варіант "Бібліотечна система" з чекпоінту.
// НЕ показувати студентам одразу - орієнтир по очікуваному обсягу й
// складності, що поєднує класи, інкапсуляцію і ArrayList з цього блоку.

public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    boolean isBorrowed() {
        return borrowed;
    }

    void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
