package designPatterns.factory.uebung.AnimalColor;

import designPatterns.factory.uebung.AnimalColor.Animal.AnimalFactory;
import designPatterns.factory.uebung.AnimalColor.Color.ColorFactory;

public class FactoryProvide {
    public static AbstractFactory getFactory(String choice){
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
