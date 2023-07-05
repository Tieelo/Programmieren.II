package ProgrammierungI.Kontrollstrukturen;

public class KontostandSchleife {
    public static void main(String[] args) {
        double liste[] = { 1, 100, 25.3, 9.2 };
        for (double kontostand : liste) {
            System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
            kontostand = kontostand * 1.005;
            System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);
        }
    }
}
