package ProgrammierungI.OO_KlassenvarKlassenmeth;

public class Person {
    int age;
    String name;
    static String planet = "Erde";

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person adam = new Person(25, "Adam");
        Person eva = new Person(27, "Eva");
        adam.info();
        eva.info();
        Person.definitionWikipedia();
    }

    public void info() {
        System.out.println(this.name + " ist " + this.age + " Jahre alt und wohnt auf " + Person.planet);
    }

    public void sprechen() {
        System.out.println("Guten Tag. Mein Name ist " + this.name);
    }

    public static void definitionWikipedia() {
        System.out.println(
                "Eine Person ist in der Umgangssprache ein durch seine individuellen Eigenschaften und Eigenarten gekennzeichneter Mensch.");
        System.out.println("Und lebt auf der " + planet);
        // folgendes erzeugt Fehler:
        // age++;
        // this.age++;
    }
}
