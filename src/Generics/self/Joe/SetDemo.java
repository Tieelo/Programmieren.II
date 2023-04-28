package Generics.self.Joe;

import java.util.HashSet;
import java.util.Set;

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }
}

public class SetDemo {

    public static void main(String[] args) {
        Set<Person> personen = new HashSet<>();

        Person person1 = new Person(1);
        Person person2 = new Person(2);

        personen.add(person1); // füge person1 zum Set hinzu
        personen.add(person2); // füge person2 zum Set hinzu

        System.out.println("Anzahl der Personen im Set: " + personen.size()); // gibt 2 aus

        person1.setId(2); // ändere die ID von person1 auf 2

        System.out.println("Anzahl der Personen im Set: " + personen.size()); // gibt immer noch 2 aus

        System.out.println("Ist person1 im Set enthalten? " + personen.contains(person1)); // gibt false aus
        System.out.println("Ist person2 im Set enthalten? " + personen.contains(person2)); // gibt true aus
    }
}
