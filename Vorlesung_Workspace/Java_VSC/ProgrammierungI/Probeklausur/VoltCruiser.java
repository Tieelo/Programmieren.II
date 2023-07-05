package ProgrammierungI.Probeklausur;

public class VoltCruiser {
    private int ladezustand;
    private String kennzeichen;
    private static int kapazitaet = 50;

    public VoltCruiser(int ladezustand, String kennzeichen) {
        this.laden(ladezustand);
        this.kennzeichen = kennzeichen;
    }

    public void fahren(int verbrauch) {
        if (this.ladezustand >= verbrauch) {
            System.out.println("Fährt");
            this.ladezustand -= verbrauch;
        } else {
            System.out.println("zu wenig Energie");
        }
    }

    public void laden(int zusatz) {
        if (zusatz < 0) return;
        if (this.ladezustand < kapazitaet) {
            if (this.ladezustand + zusatz > kapazitaet) {
                this.ladezustand = kapazitaet;
            } else {
                this.ladezustand += zusatz;
            }
        }
    }
}
