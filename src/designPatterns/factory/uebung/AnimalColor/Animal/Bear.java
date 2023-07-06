package designPatterns.factory.uebung.AnimalColor.Animal;

public class Bear implements Animal{
    @Override
    public String getAnimal() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "ROAHH";
    }
}
