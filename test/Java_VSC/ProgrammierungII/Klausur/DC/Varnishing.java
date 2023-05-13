package ProgrammierungII.Klausur.DC;

public class Varnishing extends ProcessingDecorator {
    public Varnishing(Furniture f) {
		furniture = f;
		additionalCost = 300;
		additionalDescription = " now varnished";
	}
}
