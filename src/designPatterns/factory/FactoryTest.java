package designPatterns.factory;

import designPatterns.factory.KonkreteSchuhFabriken.AdidasFabrik;
import designPatterns.factory.KonkreteSchuhFabriken.PumaFabrik;
import designPatterns.factory.interfaces.ISchuh;
import designPatterns.factory.interfaces.ISchuhFabrik;

import java.util.ArrayList;
import java.util.List;



public class FactoryTest {
    public static void main(String[] args) {
        List<ISchuhFabrik> schuhFabriken = new ArrayList<>();
        List<ISchuh> schuhe = new ArrayList<>();
                        
        ISchuhFabrik pumaFabrik = new PumaFabrik();
        ISchuhFabrik adidasFabrik = new AdidasFabrik();

        schuhFabriken.add(pumaFabrik);
        schuhFabriken.add(adidasFabrik);
        
        schuhe.add(adidasFabrik.createSchuh("W")); // W, W, W, W, W, W, EEEEEEEEEEEE
        schuhe.add(adidasFabrik.createSchuh("Wander"));
        schuhe.add(pumaFabrik.createSchuh("Turn"));
        schuhe.add(adidasFabrik.createSchuh("Wanderschuh"));

        schuhe.forEach(schuh -> System.out.println(schuh.print()));
        
    }
}