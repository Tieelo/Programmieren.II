package ProgrammierungI.Erstklausur;

public class Haus {
    private String baustoff;
    public static String baufirma = "KoelschKluengelBau";
    
    public Haus(String baustoff) {
        this.baustoff = baustoff;
    }

    public static void info() {
        System.out.println("Baufirma ist " + baufirma);
    }

    public String getBaustoff() {
        return baustoff;
    }

    
    public void setBaustoff(String baustoff) {
        this.baustoff = baustoff;
    }
    
}
