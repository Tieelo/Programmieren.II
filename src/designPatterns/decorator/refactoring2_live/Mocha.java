package designPatterns.decorator.refactoring2_live;

public class Mocha extends CondimentDecorator
{
    double price = 0.35;
    String description = " chocetty choc";
    
    public Mocha(Beverage beverage)
    {
        super(beverage);
    }
}