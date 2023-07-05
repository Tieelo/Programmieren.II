package ProgrammierungII.Nachklausur_PII.Observer;

import java.util.ArrayList;
import java.util.List;

public class Institut implements Subject {
    List<Observer> oberservers = new ArrayList<>();
    int infZahl = 0;

    @Override
    public void registerObserver(Observer ob) {
        oberservers.add(ob);
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer ob) {
        oberservers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        oberservers.forEach(ob -> ob.update(infZahl));
    }

    public void setNumber(int iz) {
        System.out.println("Neue Infektionszahl " + iz);
        this.infZahl = iz;
        this.notifyObservers();
    }
    
}
