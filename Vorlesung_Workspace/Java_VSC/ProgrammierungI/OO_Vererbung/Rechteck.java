package ProgrammierungI.OO_Vererbung;

public class Rechteck extends Figur {
    private double laenge;
    private double breite;
    
    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public void zeichne() {
        System.out.println("[]");
        
    }

    @Override
    public double getFlaeche() {
        return this.laenge * this.breite;
    }
    
}
