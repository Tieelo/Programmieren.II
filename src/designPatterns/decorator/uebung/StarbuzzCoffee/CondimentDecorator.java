package designPatterns.decorator.uebung.StarbuzzCoffee;

public abstract class CondimentDecorator extends Beverage
{   
    public Beverage beverage;
    public CondimentDecorator(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost()
    {
        return this.beverage.cost() + this.price;
    }

    @Override
    public String getDescription()
    {
        return this.beverage.getDescription() + ", " + this.description;
    }
} 