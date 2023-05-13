package ProgrammierungII.decoratorRefactoring2_live;

public class Milk extends CondimentDecorator {
    public Milk(Beverage _beverage) {
        super(_beverage);
        this.additionalDescription = " mit Milch";
        this.additionalCost = 0.10;
    }
}