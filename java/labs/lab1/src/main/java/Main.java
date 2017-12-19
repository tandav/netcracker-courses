import entities.person.Person;
import repositories.PersonRepository;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Smith", 2000, 7, 23);
        Person p2 = new Person(2, "Abc", 2000, 7, 23);
        Person p3 = new Person(3, "Marshall", 2000, 7, 23);

        System.out.println(p1.getAge());
        PersonRepository pr = new PersonRepository();
        pr.addPerson(p1);
        pr.addPerson(p2);
        System.out.println(pr);
    }
}
