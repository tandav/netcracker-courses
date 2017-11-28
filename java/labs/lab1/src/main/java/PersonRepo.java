import sun.security.util.Length;
import java.util.Arrays;

public class PersonRepo {
    Person[] repo = new Person[16];
    int number_of_elements = 0;

    void expand_repo() {
        Person[] bigger_repo = Arrays.copyOf(repo, repo.length * 2);
        repo = bigger_repo;
    }

    void add_person(Person p) {
        this.repo[number_of_elements] = p;
        this.number_of_elements += 1;
        if (this.number_of_elements == this.repo.length) {
            expand_repo();
        }
    }

    void delete_by_index(int index) {
        for(int i = index; i < repo.length - 2; i++) {
            this.repo[i] = this.repo[i + 1];
        }
        this.repo[this.repo.length - 1] = null;
        this.number_of_elements -= 1;
    }

    void delete_by_id(int id) {
        for(int i = 0; i < this.repo.length; i++) {
            if (this.repo[i].id == id) {
                delete_by_index(i);
                return;
            }
        }
    }

    Person get_person(int index) {
        return this.repo[index];
    }

//    PersonRepo search(PersonChecker check, value) {
//        PersonRepo result = new PersonRepo();
//        for(int i = 0; i < this.repo.length; i++) {
//            if (check.check(this.repo[i]], value) {
//                result.add_person(repo[i]);
//            }
//        }
//    }
}
