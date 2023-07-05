package ProgrammierungI.Erstklausur;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Eva", 'f', "Mathematikerin");
		Person p2 = new Person("Wanja", "Wirtschaftsexperte");
		Person p3 = new Person("Jim", 'm');
        PersonGI pGi = new PersonGI("Diva", "", "");
        pGi.datenAusgeben();
        PersonGI pGi2 = new PersonGI("Diva", null, "");
        pGi2.datenAusgeben();
    }
}
