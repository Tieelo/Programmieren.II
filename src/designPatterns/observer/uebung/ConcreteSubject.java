package designPatterns.observer.uebung;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private List<Observer> observerList;
    private int value = 0;

    public ConcreteSubject(){
        observerList = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observerList){
            observer.update(value);
        }
    }
    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
