package ProgrammierungI.OO_Vererbung;

public abstract class Counter {
	
	int value;
	
	public Counter() {
		System.out.println("init of counter");
		this.value = 123;
	}

	abstract int increment();
}
