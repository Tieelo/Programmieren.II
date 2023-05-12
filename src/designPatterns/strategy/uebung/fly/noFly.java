package designPatterns.strategy.uebung.fly;

public class noFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Or not to Fly");
    }
}
