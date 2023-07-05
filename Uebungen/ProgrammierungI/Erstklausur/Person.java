package ProgrammierungI.Erstklausur;

public class Person {
	private String name;
	private char sex;
	private String job;
	
	public Person(String name, char sex, String job) {
		super();
		this.name = name;
		this.sex = sex;
		this.job = job;
		System.out.println(toString());
	}
	
	public Person(String name, String job) {
		this(name, 'd', job);
	}
	
	public Person(String name, char sex) {
		this(name, sex, "IT-Fachkraft");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", job=" + job + "]";
	}
}
