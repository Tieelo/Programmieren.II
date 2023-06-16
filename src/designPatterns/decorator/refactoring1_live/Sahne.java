package ProgrammierungII.designPatterns.decorator.refactoring1_live;

public class Sahne implements Zutat {
    private double preis = 0.420;
    private String description = ", Sahne, echt lecker";

    public Sahne() {
    }

    @Override
    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String getBeschreibung() {
        return description;
    }
}