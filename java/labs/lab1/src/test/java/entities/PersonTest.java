package entities;

import entities.person.Person;
import org.junit.Test;

public class PersonTest {
    @Test
    public void getAge() throws Exception {
        Person p = new Person(1, "Smith", 2000, 7, 23);
        assertEquals(p.getAge(), 17);
    }
}