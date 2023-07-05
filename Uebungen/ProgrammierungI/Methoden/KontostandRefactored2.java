package ProgrammierungI.Methoden;

public class KontostandRefactored2 {

    public static void aktualisiereKontostand(String name, double neuerWert) {
        double kontostand = neuerWert;
        System.out.println("Anfangs beträgt der Kontostand von " + name + ": " + kontostand + " Euro.");
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt der Kontostand von " + name + ": " + kontostand + " Euro.");
    }

    public static void main(String[] args) {
        aktualisiereKontostand("Maria Musterfrau", 1);
        aktualisiereKontostand("Anna Musterfrau", 100);
        aktualisiereKontostand("Jim Mustermann", 25.3);
        aktualisiereKontostand("Wanja Mustermensch", 9.2);
        // aktualisiereKontostand(9.2, "Wanja Mustermensch"); Error!
    }
}
