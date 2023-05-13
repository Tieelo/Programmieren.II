package ProgrammierungI.OO_Vererbung;

public class SimpleCounter extends Counter {

	@Override
	int increment() {
		return ++value;
	}
}
