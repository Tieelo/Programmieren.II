package FunktionaleProgrammierung.LambdaAusdruecke;

@FunctionalInterface
public interface X {
    void m();
	
	boolean equals(Object obj);
	
	String toString();
	
	default void a() {
		System.out.println("Hallo");
	}
	
	static void b() {
		System.out.println("Welt");
	}
}
