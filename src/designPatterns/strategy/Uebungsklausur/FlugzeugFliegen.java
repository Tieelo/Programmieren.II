package designPatterns.strategy.Uebungsklausur;

public class FlugzeugFliegen implements Flugverhalten{

    public void abheben() {
        System.out.println("Das Flugzeug hebt ab");
    }


    public void landen() {
        System.out.println("Das Flugzeug landet");
    }


    public void kurshalten() {
        System.out.println("Das Flugzeug bleibt auf Kurs");
    }
}
