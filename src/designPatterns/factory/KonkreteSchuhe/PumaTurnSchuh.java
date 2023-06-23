package designPatterns.factory.KonkreteSchuhe;

import designPatterns.factory.interfaces.ITurnSchuh;

public class PumaTurnSchuh implements ITurnSchuh {
    public String print() {
        return "Puma Turn Schuh";
    }
}