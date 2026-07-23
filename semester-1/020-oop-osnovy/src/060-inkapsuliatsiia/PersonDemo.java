public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Олена", 20);

        System.out.println(person.getName() + " - " + person.getAge() + " років");

        person.setAge(21);
        System.out.println("Новий вік: " + person.getAge());

        person.setAge(-5); // некоректне значення - сетер його відхилить
        System.out.println("Вік після спроби встановити -5: " + person.getAge());
    }
}
