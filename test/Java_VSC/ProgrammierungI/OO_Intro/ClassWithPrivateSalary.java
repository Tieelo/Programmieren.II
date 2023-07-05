package ProgrammierungI.OO_Intro;

public class ClassWithPrivateSalary {
	private int salary;

	// a setter method that checks the value for the salary variable, assigns if OK
	void setSalary(int s) {
		if (s > 0) {
			this.salary = s;
		} else {
			System.out.println("Nur positive Werte erlaubt");
		}
	}

	// a getter method to retrieve the salary
	int getSalary() {
		// Code zur Authentifizierung
		return this.salary;
	}
}
