package designPatterns.decorator.uebung.StarbuzzCoffee.coffees;

import designPatterns.decorator.uebung.StarbuzzCoffee.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "Hausgemacht nach alter Tradition";
		price = 0.89;
	}
}
