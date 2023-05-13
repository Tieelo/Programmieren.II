package ProgrammierungI.OO_Interfaces;

public class Dreieck implements Geo {
    double hoehe;
    double grund;

    public Dreieck(double hoehe, double grund) {
        this.hoehe = hoehe;
        this.grund = grund;
    }

    @Override
    public double getFlaeche() {
        return 0.5 * this.hoehe * this.grund;
    }
    
}
