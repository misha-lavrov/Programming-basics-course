public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Кобзар", "Тарас Шевченко"));
        library.addBook(new Book("Тіні забутих предків", "Михайло Коцюбинський"));
        library.addBook(new Book("Захар Беркут", "Іван Франко"));

        library.printAvailableBooks();

        System.out.println("---");
        boolean success = library.borrowBook("Кобзар");
        System.out.println("Видача 'Кобзар' успішна: " + success);

        library.printAvailableBooks();

        System.out.println("---");
        library.returnBook("Кобзар");
        library.printAvailableBooks();
    }
}
