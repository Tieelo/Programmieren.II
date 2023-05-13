package ProgrammierungI.OO_Interfaces;

public class Magazine extends GameObject implements Buyable {
	double price;

	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double price() {
		return price;
	}

}
