package designPatterns.factory.KonkreteSchuhFabriken;

import designPatterns.factory.KonkreteSchuhe.AdidasWanderSchuh;
import designPatterns.factory.KonkreteSchuhe.AdidasTurnSchuh;
import designPatterns.factory.interfaces.ISchuh;
import designPatterns.factory.interfaces.ISchuhFabrik;

public class AdidasFabrik implements ISchuhFabrik {
    
    @Override
    public ISchuh createSchuh(String name) {
        switch (name) {
            case "Wander":
            case "Wanderschuh":
            case "W":
                return new AdidasWanderSchuh();
            case "Turn":
                return new AdidasTurnSchuh();
            default:
                throw new IllegalArgumentException("Schuhname nicht bekannt");
        }
        // if(name.contains("Wander")) {
        //     return new AdidasWanderSchuh();
        // } else if(name.contains("Turn")) {
        //     return new AdidasTurnSchuh();
        // } else {
        //     return null;
        // }
        
    }
}