package ProgrammierungI.OO_Vererbung;

public abstract class Mitarbeiter {
    protected String nachname;
    protected String vorname;
    protected double gehalt;

public Mitarbeiter(String nachname, String vorname, double gehalt) {
    this.nachname = nachname;
    this.vorname = vorname;
    this.gehalt = gehalt;
}

// Erhöhung des Gehalts um betrag

public void erhoeheGehalt(double betrag) {
    this.gehalt += betrag;
}

// Ausgabe aller Variableninhalte

public void zeigeDaten() {
    System.out.println("Mitarbeiter [nachname=" + nachname + ", vorname=" + vorname + ", gehalt=" + gehalt + "]");
}

// Gehalt durch Zulage erhöhen

public abstract void addZulage(double betrag);
}
