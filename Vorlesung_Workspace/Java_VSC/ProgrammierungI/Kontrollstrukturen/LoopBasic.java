package ProgrammierungI.Kontrollstrukturen;

public class LoopBasic {
    public static void main(String[] args) {

        int a = 5;

		for (int i = 0; i < 10; i++) {
            System.out.println("Aktueller Wert des Laufindexes: " + i);
        }

        for (char c = 65; c < 91; c++) {
            System.out.println("Aktueller Buchstabe: " + c);
        }

        for (int i = 1; i <= 20; i++) {
            if (i != 13) {
                System.out.println("Aktueller Wert des Laufindexes: " + i);
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Lauf-Variable: " + i);
            System.out.println("Variable von außen: a = " + a);
        }
        // System.out.println("Aktueller Wert des Laufindexes: " + i);
	}
}
