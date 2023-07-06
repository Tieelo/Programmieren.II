package designPatterns.decorator.refactoring2_live;

public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage)
    {
        super(beverage);
        double price = 0.35;
        String description = " chocetty choc";
    }
}