package ProgrammierungI.OO_Vererbung;

public class Kreis extends Figur {
    private double radius; 

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public void zeichne() {
        System.out.println("O");
        
    }

    @Override
    public double getFlaeche() {
        // gute Beispiele fuer statisches Attribut/Methode:
        return Math.PI * Math.pow(this.radius, 2);
    }
    
}
