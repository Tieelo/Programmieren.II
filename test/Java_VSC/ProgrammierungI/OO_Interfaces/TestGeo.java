package ProgrammierungI.OO_Interfaces;

public class TestGeo {
    public static void main(String[] args) {
        Kreis Kreis1 = new Kreis(5);
        Dreieck Dreieck1 = new Dreieck(5, 3);
        int vergleich = GeoVergleich.vergleiche(Dreieck1, Kreis1);
        System.out.println("Ergebnis ist " + vergleich);
    }
}
