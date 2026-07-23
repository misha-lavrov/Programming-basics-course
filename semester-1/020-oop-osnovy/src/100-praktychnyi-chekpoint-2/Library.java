// Library "містить" список книг (композиція: клас, що керує колекцією
// об'єктів іншого класу) - природне продовження ArrayList із заняття 030
// разом із класами й інкапсуляцією з усього цього блоку.

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.setBorrowed(true);
                return true;
            }
        }
        return false; // не знайдено або вже видана
    }

    void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setBorrowed(false);
                return;
            }
        }
    }

    void printAvailableBooks() {
        System.out.println("Доступні книги:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("- " + book.getTitle() + " (" + book.getAuthor() + ")");
            }
        }
    }
}
