package ProgrammierungII.Klausur.AI;

public class AktienInfoTest {
    public static void main(String[] args) {
        Observer alice = new Aktionaer();
        Observer bob = new Aktionaer();

        Aktiengesellschaft eFuelsNrw = new Aktiengesellschaft();
        eFuelsNrw.registerObserver(alice);
        eFuelsNrw.registerObserver(bob);

        eFuelsNrw.setPrice(12.4);
        System.out.println("Remove Bob");
        eFuelsNrw.removeObserver(bob);
        eFuelsNrw.setPrice(12.2);
        eFuelsNrw.setPrice(22.0);
    }
}
