package ProgrammierungII.Klausur.AI_Students;

public interface Aktie {
    void addObserver(Observer ob);
    void setPrice(double price);
    double getPreis();
}
