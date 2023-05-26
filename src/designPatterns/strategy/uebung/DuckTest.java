package designPatterns.strategy.uebung;

import designPatterns.strategy.uebung.enten.MallardDuck;
import designPatterns.strategy.uebung.enten.RubberDuck;
import designPatterns.strategy.uebung.fly.fly;
import designPatterns.strategy.uebung.quack.Quacken;

public class DuckTest {


	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setQ(new Quacken());
		mallard.setF(new fly());
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