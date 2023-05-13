package ProgrammierungII.Klausur.DC;

public abstract class ProcessingDecorator extends Furniture {
    Furniture furniture;
	double additionalCost;
	String additionalDescription;

	public String getDescription() {
		return furniture.getDescription() + additionalDescription;
	}

	@Override
	public double cost() {
		return furniture.cost() + additionalCost;
	}
}
