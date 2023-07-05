package ProgrammierungII.factoryAbstract_Schuhfabrik;

public class TestSchuh {
	public static void main(String[] args) {
		Schuhfabrik sf = new GucciSchuhFabrik();
        Schuh schuh = sf.erzeugeSchuh("W");
        System.out.println("Erzeugt wurde: " + schuh.getName());
	}
}
