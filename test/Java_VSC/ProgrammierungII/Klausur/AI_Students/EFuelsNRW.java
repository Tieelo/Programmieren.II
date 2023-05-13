package ProgrammierungII.Klausur.AI_Students;

import java.util.ArrayList;
import java.util.List;

public class EFuelsNRW implements Aktie {
    private final List<Observer> observers = new ArrayList<>();
    private double price = 10.5;

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
        // new observers should get the present price value, even if it has not changed
        System.out.println("initial info");
    }


    public double getPreis() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Set price to " + price);
        this.price = price;
        observers.forEach(Observer::update);
    }
    
}
