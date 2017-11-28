import org.joda.time.*;
import org.joda.time.format.*;

public class Person {
    int id;
    String last_name;
    LocalDate birth_date;

    Person(int id, String last_name, int year, int month_of_year, int day_of_month) {
        id = id;
        birth_date = new LocalDate(year, month_of_year, day_of_month);
        last_name = last_name;
    }

    int get_age() {
        return Years.yearsBetween(birth_date, LocalDate.now()).getYears();
    }
}

