package designPatterns.observer.uebung.pinguin;

import designPatterns.observer.uebung.Observer;

public interface Subjekt {
    public void registerObserver(Beobachter Beobachter);
    public void removeObserver(Beobachter Beobachter);
    public void notifyObservers();
}
