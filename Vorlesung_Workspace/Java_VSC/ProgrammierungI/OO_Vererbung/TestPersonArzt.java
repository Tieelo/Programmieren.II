package ProgrammierungI.OO_Vererbung;

public class TestPersonArzt {
    public static void main(String[] args) {
        Person peter = new Person(57, "Peter Meier");
        peter.info();
        Arzt ariane = new Arzt(41, "Ariane Schmid", "Neurologie");
        ariane.info();
        ariane.diagnoseStellen();

        //Person armin = new Arzt(23, "Armin Mueller", "Kardiologie");
        zeigePerson(ariane);

        Person misch = new Arzt(33, "Mix", "Allgemein");
        misch.info();
        System.out.println("Cast-Test:");
        ((Arzt) misch).diagnoseStellen();
        // Achtung Crash: ((Arzt) peter).diagnoseStellen();
        System.out.println("Info-Test: welche Variante wird aufgerufen?");
        misch.info(); // votum: unentschieden!

        checkTypes(peter); // votum false
        checkTypes(ariane); // votum true
        checkTypes(misch); // 2/3 wahr
    }

    public static void zeigePerson(Person p) {
        System.out.println("ZeigePerson sagt: " + p.name);
    }

    private static void checkTypes(Person testObject) {
        if ((testObject instanceof Arzt) && (testObject instanceof Person)) {
            System.out.println(testObject.name + " ist beides");
        } else {
            System.out.println(testObject.name + " ist nicht beides");
        }
    }
}
