package ProgrammierungII.Klausur.DC;

public class Table extends Furniture {
    public Table() {
		description = "An oak table";
	}

	@Override
	public double cost() {
		return 800;
	}
}
