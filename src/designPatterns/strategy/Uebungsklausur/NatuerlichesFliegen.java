package designPatterns.strategy.Uebungsklausur;

public class NatuerlichesFliegen implements Flugverhalten{

    public void abheben() {
        System.out.println("Die Ente fliegt selbst");
    }


    public void landen() {
        System.out.println("Die Ente landet selbst");
    }


    public void kurshalten() {
        System.out.println("Die Ente kann den Kurs nicht halten");
    }
}
