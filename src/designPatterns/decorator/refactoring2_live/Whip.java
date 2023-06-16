package ProgrammierungII.designPatterns.decorator.refactoring2_live;

public class Whip extends CondimentDecorator
{
    // double price = 0.25;
    // String description = " whippety whip";
    
    public Whip(Beverage beverage)
    {
        super(beverage);
        this.description = "whippety whip, slurp slurp";
        this.price = 0;
    }
}