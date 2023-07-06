package designPatterns.decorator.uebung.StarbuzzCoffee.Condiments;

import designPatterns.decorator.uebung.StarbuzzCoffee.Beverage;
import designPatterns.decorator.uebung.StarbuzzCoffee.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
        this.description = "Soy";
        this.price = 0.99;
    }
}
