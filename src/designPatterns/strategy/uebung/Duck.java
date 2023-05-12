package designPatterns.strategy.uebung;

import designPatterns.strategy.uebung.fly.Flyable;
import designPatterns.strategy.uebung.quack.Quackable;

public abstract class Duck implements Quackable, Flyable {
	Quackable q;
	Flyable f;

	void setQ(Quackable q) {
		this.q = q;
	}
	void setF(Flyable f){
		this.f = f;
	}
	public void canFly(){
		f.fly();
	}
	public void makeNoise(){
		q.quack();
	}


	public void swim() {
		System.out.println("Swimming");
	}

	public void fly() {
		System.out.println("Flying");
	}

	public abstract void display();
}

