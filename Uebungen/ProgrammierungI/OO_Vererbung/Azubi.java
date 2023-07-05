package ProgrammierungI.OO_Vererbung;

public class Azubi extends Mitarbeiter {
    private int abgelegtePruefungen;

    public Azubi(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    // Zahl der abgelegten Prüfungen setzen

    public void setPruefungen(int anzahl) {
        this.abgelegtePruefungen = anzahl;
    }

    // Ausgabe aller Variableninhalte

    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("... und abgelegte Prüfungen: " + this.abgelegtePruefungen);
    }

    @Override
    public void addZulage(double betrag) {
        if (abgelegtePruefungen > 3) {
            this.erhoeheGehalt(betrag);
        }

    }
}
