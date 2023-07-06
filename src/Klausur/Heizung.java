package Klausur;

public class Heizung {
    private int fuellstand;

    public Heizung(int fuellstand) {
        this.fuellstand = fuellstand;
    }

    public synchronized void heizeHaus(int oelBedarf) {
        if (oelBedarf > fuellstand) {
            System.out.println("Nicht genügend Heizöl um das Haus zu heizen");
        } else {
            fuellstand -= oelBedarf;
            System.out.println("Heize das Haus. Fuellstand: " + fuellstand);
        }
    }

    public synchronized void refill(int oelNachfuellung) {
        fuellstand += oelNachfuellung;
        System.out.println("Heizöl nachgefüllt. Fuellstand " + fuellstand);
    }

    public synchronized int getFuellstand() {
        return fuellstand;
    }
}
