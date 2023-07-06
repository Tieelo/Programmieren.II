package Klausur.Fortbewegunsmittel.FortbewegunsMittel;

public class FahrradFahren implements Fahrverhalten{
    @Override
    public void beschleunigen() {
        System.out.println("Feste in die Pedale treten");
    }

    @Override
    public void abbiegen() {
        System.out.println("Handzeichen geben und Balance halten");
    }

    @Override
    public void bremsen() {
        System.out.println("QUIEEEETSCH");
    }
}
