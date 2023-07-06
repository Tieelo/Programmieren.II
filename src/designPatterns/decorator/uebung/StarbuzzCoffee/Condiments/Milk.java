package designPatterns.decorator.uebung.StarbuzzCoffee.Condiments;

import designPatterns.decorator.uebung.StarbuzzCoffee.Beverage;
import designPatterns.decorator.uebung.StarbuzzCoffee.CondimentDecorator;

public class Milk extends CondimentDecorator
{
    public Milk(Beverage beverage)
    {
        super(beverage);
        this.description = "Milch";
        this.price = 0.10;

    }
    // kann hier raus, weil (jetzt) von oben geerbt:
    // @Override
    // public double cost()
    // {
    //     return beverage.cost() + this.price;
    // }

    // @Override
    // public String getDescription()
    // {
    //     return beverage.getDescription() + ", " + this.description;
    // }
}