import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Smith", 2000, 7, 23);
        System.out.println(p1.get_age());
    }
}
