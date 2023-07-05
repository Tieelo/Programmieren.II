package ProgrammierungII.decoratorRefactoring2_live;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Entkoffeinierter Kaffee ";
    }

    @Override
    String getDescription() {
        return this.description;
    }

    @Override
    double cost() {
        return 1.05;
    }

}
