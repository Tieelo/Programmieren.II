package ProgrammierungI.OO_Vererbung;

public class TageMuster extends Zeit {
	private long tage;

	public TageMuster(long tage) {
		super();
		this.tage = tage;
	}

	@Override
	long getMinuten() {
		return this.tage * 24 * 60;
	}
}
