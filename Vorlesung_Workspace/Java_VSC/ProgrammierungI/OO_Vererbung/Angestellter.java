package ProgrammierungI.OO_Vererbung;

public class Angestellter extends Mitarbeiter {
    private static final int MAX_STUFE = 5;
    private int stufe;

    public Angestellter(String nachname, String vorname, double gehalt) {
        super(nachname, vorname, gehalt);
    }

    // Stufe um 1 erhöhen

    public void befoerdere() {
        if (this.stufe < MAX_STUFE) {
            this.stufe++;
        }
    }

    // Ausgabe aller Variableninhalte

    public void zeigeDaten() {
        super.zeigeDaten();
        System.out.println("... und Stufe = " + this.stufe);
    }

    public void addZulage(double betrag) {
        if (stufe > 1) {
            this.erhoeheGehalt(betrag);
        }
    }
}
