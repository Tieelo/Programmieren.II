package ProgrammierungI.OO_Vererbung;

public class Tage extends Zeit {
    int anzahlTage;

    public Tage(int anzahlTage) {
        super();
        this.anzahlTage = anzahlTage;
    }

    @Override
    long getMinuten() {
        return this.anzahlTage * 24 * 60;
    }
    
}
