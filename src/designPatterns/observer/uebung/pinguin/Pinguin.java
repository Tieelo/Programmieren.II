package designPatterns.observer.uebung.pinguin;

import java.util.ArrayList;
import java.util.List;

public class Pinguin implements Subjekt{
    private List<Beobachter> beobachterList = new ArrayList<>();
    private String action;
    @Override
    public void registerObserver(Beobachter beobachter) {
        this.beobachterList.add(beobachter);

    }

    @Override
    public void removeObserver(Beobachter beobachter) {
        this.beobachterList.remove(beobachter);
    }
    @Override
    public void notifyObservers() {
        for(Beobachter beobachter : beobachterList){
            beobachter.update();
        }
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action){
        this.action = action;
        this.notifyObservers();
    }
}
