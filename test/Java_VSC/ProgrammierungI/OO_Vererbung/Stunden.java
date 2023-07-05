package ProgrammierungI.OO_Vererbung;

public class Stunden extends Zeit {
    private long stunden;

    public Stunden(long stunden) {
        super();
        this.stunden = stunden;
    }

    @Override
    long getMinuten() {
        return this.stunden * 60;
    }

    
}
