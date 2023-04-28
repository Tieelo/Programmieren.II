import java.util.Scanner;

public class SchwimmbadPreise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Anzahl der Tage: ");
        int anzahlTage = input.nextInt();

        System.out.print("Erster Wochentag (1 = Montag, 2 = Dienstag, usw.): ");
        int ersterTag = input.nextInt();

        double gesamtPreis = 0;

        for (int i = 0; i < anzahlTage; i++) {
            switch (ersterTag) {
                case 1: gesamtPreis += 4.5; break;
                case 2: gesamtPreis += 6; break;
                case 3: gesamtPreis += 7; break;
                case 4:
                case 5:
                case 6:
                case 7: gesamtPreis += 8; break;
                default: System.out.println("Ungültiger Wochentag!"); return;
            }

            ersterTag = (ersterTag % 7) + 1;
        }

        System.out.println("Gesamtpreis: " + gesamtPreis + " €");
    }
}