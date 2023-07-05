package ProgrammierungI.Kontrollstrukturen;

public class KontostandRedundant {
    public static void main(String[] args) {
        double kontostand = 1;
        System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);

        kontostand = 100;
        System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);

        kontostand = 25.3;
        System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);

        kontostand = 9.2;
        System.out.println("Anfangs beträgt Ihr Kontostand " + kontostand);
        kontostand = kontostand * 1.005;
        System.out.println("Nach einem Jahr beträgt Ihr Kontostand " + kontostand);
    }
}
