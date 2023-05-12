package designPatterns.strategy.uebung.quack;

import designPatterns.strategy.uebung.quack.Quackable;

public class Quacken implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
