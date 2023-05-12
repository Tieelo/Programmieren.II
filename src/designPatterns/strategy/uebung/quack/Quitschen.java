package designPatterns.strategy.uebung.quack;

import designPatterns.strategy.uebung.quack.Quackable;

public class Quitschen implements Quackable {

    @Override
    public void quack() {
        System.out.println("Quitsch! Quitsch!");
    }
}
