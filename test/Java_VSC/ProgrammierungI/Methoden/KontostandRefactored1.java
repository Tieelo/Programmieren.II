package ProgrammierungI.Methoden;

public class KontostandRefactored1 {
    public static void main(String[] args) {
        aktualisiereKontostand(1);
        aktualisiereKontostand(100);
        aktualisiereKontostand(25.3);
        aktualisiereKontostand(9.2);
    }

    public static void aktualisiereKontostand(double neuerWert) {
        double kontostand = neuerWert;
        System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);
    }
}
