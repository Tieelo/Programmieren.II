package FunktionaleProgrammierung.Streams.Uebungen;

import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        // Person-Objekte erzeugen
        Person person1 = new Person("Max", "Mustermann");
        Person person2 = new Person("Anna", "Müller");
        Person person3 = new Person("Peter", "Schmidt");
        Person person4 = new Person("Maria", "Meier");

        // Liste von Person-Objekten erzeugen
        List<Person> persons = Arrays.asList(person1, person2, person3, person4);

        // Namen in Großbuchstaben wandeln und sortieren
        Object[] names = persons.stream()
                .map(p -> p.getFirstName().toUpperCase() + " " + p.getLastName().toUpperCase())
                .sorted()
                .toArray();

        // Namen ausgeben
        System.out.println(Arrays.toString(names));
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
