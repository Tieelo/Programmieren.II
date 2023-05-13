package ProgrammierungI.Methoden;

public class KontostandMehrereJahre {
    public static void main(String[] args) {
        int jahre = 4;
        // double ergebnis = aktualisiereKontostand(1);
        // System.out.println("In der MainMethode: der Wert mit Zinsen: " + ergebnis);
        // ergebnis = aktualisiereKontostand(ergebnis);
        // System.out.println("In der MainMethode: der Wert mit Zinseszinsen: " +
        // ergebnis);
        // aktualisiereKontostand(100);
        // aktualisiereKontostand(25.3);
        // aktualisiereKontostand(9.2);
        double kontostand = 1234.56;
        for (int i = 0; i < jahre; i++) { // 0,1,2,3 --> 4 mal; Informatiker fangen bei 0 an :)
            kontostand = Math.round(aktualisiereKontostand(kontostand) * 100) / 100; // Kontostand wird auf 2
                                                                                     // nachkommastellen gerundet
            System.out.println("Nach: " + (i + 1) + " Jahren ist der Kontostand: " + kontostand); // i+1 weil human
                                                                                                  // readable
        }
    }

    public static double aktualisiereKontostand(double neuerWert) {
        double kontostand = neuerWert;
        kontostand = kontostand * 1.005;
        return kontostand;
        // How about that:
        // return neuerWert * 1.005;
    }
}
