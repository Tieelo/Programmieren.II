package ProgrammierungII.Klausur.AI;

import java.util.ArrayList;
import java.util.List;

public class Aktiengesellschaft implements Subject {
    List<Observer> observers = new ArrayList<>();
    private double price = 15.0;

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
        // new observers should get the present price value, even if it has not changed
        System.out.println("initial info");
        this.notifyObservers();
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(ob -> ob.update(price));
    }

    public void setPrice(double price) {
        System.out.println("Set price to " + price);
        this.price = price;
        this.notifyObservers();
    }
    
}
