package designPatterns.decorator.uebung.StarbuzzCoffee;

public abstract class Beverage {
	protected String description;	
	protected double price;
	
	public double cost() {
		return this.price;
	}

	public String getDescription() {
		return this.description;
	}
}
