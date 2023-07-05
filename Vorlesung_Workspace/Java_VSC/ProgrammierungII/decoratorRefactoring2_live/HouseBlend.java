package ProgrammierungII.decoratorRefactoring2_live;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "Hausgemachter Kaffee";
    }

    @Override
    String getDescription() {
        return this.description;
    }

    @Override
    double cost() {
        return 0.89;
    }
}