package designPatterns.strategy.uebung;

import designPatterns.strategy.uebung.enten.MallardDuck;
import designPatterns.strategy.uebung.enten.RubberDuck;

public class DuckTest {


	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setQ(new Quaken());
		mallard.setF(new Fly());
		mallard.makeNoise();
		mallard.canFly();
		mallard.swim();
		mallard.display();


		Duck rubberDuck = new RubberDuck();
		rubberDuck.quack();
		rubberDuck.display();
		rubberDuck.fly();
	}

}