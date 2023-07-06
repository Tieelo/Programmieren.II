package designPatterns.factory.uebung.AnimalColor;

import designPatterns.factory.uebung.AnimalColor.Animal.Animal;
import designPatterns.factory.uebung.AnimalColor.Color.Color;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvide.getFactory("Animal");
        Animal animal =(Animal) abstractFactory.create("Dog");

        abstractFactory = FactoryProvide.getFactory("Color");
        Color color = (Color) abstractFactory.create("Brown");

        String result = "A " + animal.getAnimal() + " with " + color.getColor() + " color " + animal.makeSound();
        System.out.println(result);
    }
}
