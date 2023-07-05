package ProgrammierungI.Kontrollstrukturen;

public class Wochentage {
    public static void main(String[] args) {
    
        int wochentag = 1;

        // Möglichkeit 1:

        // if (wochentag == 1 || wochentag == 2 || wochentag == 3 || wochentag == 4 || wochentag == 5) {
        //     System.out.println("Werktag");
        // } else {
        //     System.out.println("Wochenende");
        // }

        // Möglichkeit 2:

        // if (wochentag >= 1 && wochentag <= 5 ) {
        //     System.out.println("Werktag");
        // } else {
        //     System.out.println("Wochenende");
        // }

        // Möglichkeit 3:

        if (wochentag == 1) {
            System.out.println("Werktag");
        } else if (wochentag == 2) {
            System.out.println("Werktag");
        } else if (wochentag == 3) {
            System.out.println("Werktag");
        } else if (wochentag == 4) {
            System.out.println("Werktag");
        } else if (wochentag == 5) {
            System.out.println("Werktag");
        } else if (wochentag == 6) {
            System.out.println("Wochenende");
        } else if (wochentag == 7) {
            System.out.println("Wochenende");
        } else {
            System.out.println("Ungültige Eingabe");
        }
    }
}
