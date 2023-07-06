package designPatterns.decorator.uebung.StarbuzzCoffee.Condiments;

import designPatterns.decorator.uebung.StarbuzzCoffee.Beverage;
import designPatterns.decorator.uebung.StarbuzzCoffee.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        this.price = 0.35;
        this.description = "Mocha";
    }
}