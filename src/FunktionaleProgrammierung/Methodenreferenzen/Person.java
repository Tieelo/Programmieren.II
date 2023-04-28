package FunktionaleProgrammierung.Methodenreferenzen;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean containsO() {
		return (this.name.contains("o") || this.name.contains("O"));
	}
}