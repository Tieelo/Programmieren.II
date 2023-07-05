package ProgrammierungII.Klausur.DC;

public class Chair extends Furniture {
    public Chair() {
		description = "A wooden chair";
	}

	@Override
	public double cost() {
		return 80;
	}
}
