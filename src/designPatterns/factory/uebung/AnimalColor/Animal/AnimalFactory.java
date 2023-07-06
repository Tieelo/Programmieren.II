package designPatterns.factory.uebung.AnimalColor.Animal;

import designPatterns.factory.uebung.AnimalColor.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        } else if ("Bear".equalsIgnoreCase(animalType)) {
            return new Bear();
        }
        return null;
    }
}
