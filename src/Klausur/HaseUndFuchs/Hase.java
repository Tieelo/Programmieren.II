package Klausur.HaseUndFuchs;


import java.util.ArrayList;
import java.util.List;

public class Hase implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private String action;
    public String getAction(){return action;}

    public void setAction(String action){
        this.action = action;
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList){
            observer.update();
        }
    }
}
