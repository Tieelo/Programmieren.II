package ProgrammierungI.OO_Vererbung;

public abstract class Zeit {
	abstract long getMinuten();
	
	public long getSekunden() {
		return getMinuten() * 60;
	}
}

