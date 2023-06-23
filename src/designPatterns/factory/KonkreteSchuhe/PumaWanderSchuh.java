package designPatterns.factory.KonkreteSchuhe;

import designPatterns.factory.interfaces.IWanderSchuh;

public class PumaWanderSchuh implements IWanderSchuh {
    public String print() {
        return "Puma Wander Schuh";
    }
}