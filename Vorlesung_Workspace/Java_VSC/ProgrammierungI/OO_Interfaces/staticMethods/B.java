package ProgrammierungI.OO_Interfaces.staticMethods;

import java.io.IOException;

public class B implements InterfaceWithStaticMethod {
//public class B extends Oberklasse {
	public static void main(String[] args) throws InterruptedException, IOException {
		B b = new B();

		// Folgende Aufrufe sind nicht moeglich:
		// B.m();
		// b.m();
		// stattdessen moeglich:
		InterfaceWithStaticMethod.m();
	}
}
