package designPatterns.factory.KonkreteSchuhe;

import designPatterns.factory.interfaces.IWanderSchuh;

public class AdidasWanderSchuh implements IWanderSchuh {
    public String print() {
        return "Adidas Wander Schuh";
    }
}