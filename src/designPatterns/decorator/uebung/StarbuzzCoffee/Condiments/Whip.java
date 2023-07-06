package designPatterns.decorator.uebung.StarbuzzCoffee.Condiments;

import designPatterns.decorator.uebung.StarbuzzCoffee.Beverage;
import designPatterns.decorator.uebung.StarbuzzCoffee.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
        this.description = "Whip";
        this.price = 0.35;
    }
}