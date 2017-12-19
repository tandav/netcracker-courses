package checkers.Person;

import ru.vsu.entity.entityImpl.Person;
import ru.vsu.searcher.PersonChecker;

public class LastName implements Checker {
    public boolean check(Person p, Object value) {
        return p.getLastName().equals(value);
    }
}
