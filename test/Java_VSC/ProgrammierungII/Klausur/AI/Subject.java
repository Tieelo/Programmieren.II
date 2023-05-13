package ProgrammierungII.Klausur.AI;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}
