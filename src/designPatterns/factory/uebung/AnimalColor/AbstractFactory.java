package designPatterns.factory.uebung.AnimalColor;

public interface AbstractFactory<T> {
    T create(String animalType);
}
