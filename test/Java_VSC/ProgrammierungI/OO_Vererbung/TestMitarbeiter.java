package ProgrammierungI.OO_Vererbung;

public class TestMitarbeiter {
    public static void main(String[] args) {
        Azubi azubi = new Azubi("Zimmer", "Arndt", 450);
        azubi.zeigeDaten();
        azubi.addZulage(23);
        azubi.zeigeDaten();
        azubi.erhoeheGehalt(1.76);
        azubi.zeigeDaten();
        azubi.setPruefungen(4);
        azubi.addZulage(111);
        azubi.zeigeDaten();
    }
}
