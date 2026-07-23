public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Кобзар";
        book1.author = "Тарас Шевченко";
        book1.pages = 240;

        Book book2 = new Book();
        book2.title = "Тіні забутих предків";
        book2.author = "Михайло Коцюбинський";
        book2.pages = 120;

        System.out.println(book1.title + " - " + book1.author + " (" + book1.pages + " стор.)");
        System.out.println(book2.title + " - " + book2.author + " (" + book2.pages + " стор.)");
    }
}
