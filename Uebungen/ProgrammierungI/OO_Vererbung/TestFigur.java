package ProgrammierungI.OO_Vererbung;

public class TestFigur {
    public static void main(String[] args) {

        Figur[] figuren = new Figur[2];
        figuren[0] = new Kreis(3.5);
        figuren[1] = new Rechteck(2.4, 5.0);

        for (Figur f : figuren) {
            f.zeichne();
            System.out.println("Fläche beträgt: " + f.getFlaeche());
        }
    }
}
