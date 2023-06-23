package designPatterns.factory.KonkreteSchuhe;

import designPatterns.factory.interfaces.ITurnSchuh;
public class AdidasTurnSchuh implements ITurnSchuh {
    public String print() {
        return "Adidas Turnschuh können du laufen schell :O";
    }
}