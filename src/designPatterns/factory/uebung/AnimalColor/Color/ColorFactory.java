package designPatterns.factory.uebung.AnimalColor.Color;

import designPatterns.factory.uebung.AnimalColor.AbstractFactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color create(String animalType) {
        if ("White".equalsIgnoreCase(animalType)){
            return new White();
        } else if ("Black".equalsIgnoreCase(animalType)) {
            return new Black();
        } else if ("Brown".equalsIgnoreCase(animalType)) {
            return new Brown();
        }
        return null;
    }
}
