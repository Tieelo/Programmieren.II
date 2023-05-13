package ProgrammierungII.Generics;

import java.util.ArrayList;
import java.util.List;

// Bsp. aus "Der Weg zum Java-Profi (Michael Inden)"

public class TestPersonList {
    public static void main(String[] args) {
        final List personList = new ArrayList();
        personList.add(new Person("Adam", "Aschaffenburg"));
        personList.add(new Person("Martha", "Mainz"));
        personList.add(new Dog("Terrier"));

        for (int i=0; i < personList.size(); i++) {
            final Person person = (Person) personList.get(i);
            System.out.println(person.getName() + person.getCity());
        }
    }
}
