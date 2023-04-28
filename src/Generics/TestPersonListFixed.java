package Generics;

import java.util.ArrayList;
import java.util.List;

public class TestPersonListFixed {
    public static void main(String[] args) {
        final List<Person> personList = new ArrayList<>();
        personList.add(new Person("Adam", "Aschaffenburg"));
        personList.add(new Person("Martha", "Mainz"));
        // personList.add(new Dog("Terrier"));

        for (int i=0; i < personList.size(); i++) {
            final Person person = personList.get(i);
            System.out.println(person.getName() + person.getCity());
        }
    }
}
