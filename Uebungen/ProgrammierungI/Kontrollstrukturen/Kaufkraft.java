package ProgrammierungI.Kontrollstrukturen;

public class Kaufkraft {
    public static void main(String[] args) {
        double kontostand = 500.67;
        double produktpreis = 13.12;
        int n = 0;

        while (kontostand >= produktpreis) {
            kontostand -= produktpreis;
            n++;
        }
        System.out.println("Produkt konnte " + n + " mal gekauft werden. Reststand = " + kontostand);
    }
}
