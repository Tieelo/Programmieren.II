package designPatterns.factory.KonkreteSchuhFabriken;

import designPatterns.factory.KonkreteSchuhe.PumaTurnSchuh;
import designPatterns.factory.KonkreteSchuhe.PumaWanderSchuh;
import designPatterns.factory.interfaces.ISchuh;
import designPatterns.factory.interfaces.ISchuhFabrik;
public class PumaFabrik implements ISchuhFabrik {
    
    @Override
    public ISchuh createSchuh(String name) {
        if(name.equals("Wander")) {
            return new PumaWanderSchuh();
        } else if(name.equals("Turn")) {
            return new PumaTurnSchuh();
        } else {
            return null;
        }
        
    }
}