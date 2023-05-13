package ProgrammierungI.Kontrollstrukturen;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
            System.out.println("Aktueller Wert des Laufindexes: " + i);
        }

        int kontostand = 10000;
        int preis = 600;
        int anzahl = 0;

        while (kontostand >= preis) {
            kontostand = kontostand - preis;
            anzahl++;
        }

        System.out.println("Sie können " + anzahl + " Produkte kaufen und haben dann noch " + kontostand);

        Random random = new Random();
        int number;
		do {
            number = random.nextInt(6) + 1;
            System.out.println(number);
        } while (number != 6);
    }

    // private static double teilen(double a, int b, char c) {
    //     double quotient = a/b;
    //     // was fehlt hier noch?
    // }
}
