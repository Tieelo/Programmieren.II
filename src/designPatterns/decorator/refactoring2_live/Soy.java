package designPatterns.decorator.refactoring2_live;

public class Soy extends CondimentDecorator{
    protected Soy(Beverage beverage) {
        super(beverage);
        this.description = "The Better option (for the World at least)";
        this.price = 0.99;
    }
}
