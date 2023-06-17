package designPatterns.decorator.refactoring2_live;

public class Milk extends CondimentDecorator
{
    public Milk(Beverage beverage)
    {
        super(beverage);
        this.description = "Milch von der Kuh moohoo";
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