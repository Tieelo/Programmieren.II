package Klausur.Fortbewegunsmittel.FortbewegunsMittel;

public class AutoFahren implements Fahrverhalten{
    @Override
    public void beschleunigen() {
        System.out.println("Gaspedal betätigen");
    }

    @Override
    public void abbiegen() {
        System.out.println("Blinker setzen");
    }

    @Override
    public void bremsen() {
        System.out.println("Bremspedal finden");
    }
}
