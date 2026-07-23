public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Кобзар", "Тарас Шевченко", 240);
        Book book2 = new Book("Нова книга без сторінок", "Невідомий автор"); // викличе другий конструктор

        System.out.println(book1.title + " - " + book1.author + " (" + book1.pages + " стор.)");
        System.out.println(book2.title + " - " + book2.author + " (" + book2.pages + " стор.)");
    }
}
