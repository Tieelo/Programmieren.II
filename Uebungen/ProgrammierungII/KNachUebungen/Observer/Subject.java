package ProgrammierungII.Nachklausur_PII.Observer;

public interface Subject {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}
