package Klausur;

public class HeizungEnum {
    private int fuellstand;

    public enum Status {
        HEATING, IDLE
    }

    private Status status;

    public HeizungEnum(int fuellstand) {
        this.fuellstand = fuellstand;
        this.status = Status.IDLE;
    }

    public void heizeHaus(int oelBedarf) {
        if (oelBedarf > fuellstand) {
            System.out.println("Nicht genügend Heizöl um das Haus zu heizen");
        } else {
            fuellstand -= oelBedarf;
            status = Status.HEATING;
            System.out.println("Heize das Haus. Fuellstand: " + fuellstand);
        }
    }

    public void refill(int oelNachfuellung) {
        fuellstand += oelNachfuellung;
        System.out.println("Heizöl nachgefüllt. Fuellstand " + fuellstand);
        status = Status.IDLE;
    }

    public int getFuellstand() {
        return fuellstand;
    }

    public Status getStatus() {
        return status;
    }
}