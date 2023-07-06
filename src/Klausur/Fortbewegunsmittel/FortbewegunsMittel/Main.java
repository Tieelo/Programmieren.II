package Klausur.Fortbewegunsmittel.FortbewegunsMittel;

public class Main {
    public static void main(String[] args) {
        Person mirco = new Mirco();

        System.out.println("Mirco fährt zuerst mit dem Auto");

        mirco.setFahrverhalten(new AutoFahren());
        mirco.beschleunigen();
        mirco.bremsen();

        System.out.println("Mirco steigt lieber aufs Rad");

        mirco.setFahrverhalten(new FahrradFahren());
        mirco.beschleunigen();
        mirco.abbiegen();
    }
}
