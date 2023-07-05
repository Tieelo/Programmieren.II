package ProgrammierungII.Klausur.AI_Students;

public class AktienInfoTest {
    public static void main(String[] args) {
        System.out.println("Hello Fuels!");
        Aktie aktie = new EFuelsNRW();
        Observer alice = new Aktionaer(aktie);
        Observer bob = new Aktionaer(aktie);

        aktie.addObserver(alice);
        aktie.addObserver(bob);

        aktie.setPrice(5.1D);
        aktie.setPrice(6.9D);
    }
}
