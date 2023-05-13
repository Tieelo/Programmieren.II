package ProgrammierungII.decoratorRefactoring2_live;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    String additionalDescription;
    double additionalCost;

    public CondimentDecorator(Beverage _beverage) {
        this.beverage = _beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + this.additionalDescription;
    }

    double cost() {
        return this.beverage.cost() + this.additionalCost;
    }
}
