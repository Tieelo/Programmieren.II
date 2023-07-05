package ProgrammierungII.Generics;

public class Paar<T, U> implements Markierbar<String>{
	protected T att_TypT;
	protected U att_TypU;
	protected String marke;

	public Paar(T a1, U a2) {
		super();
		System.out.println("Paar: parametrised-constructor");
		this.att_TypT = a1;
		this.att_TypU = a2;
	}

	public Paar() {
		super();
		System.out.println("Paar: parameterless-constructor");
	}


	public T getAtt_TypT() {
		return att_TypT;
	}

	public void setAtt_TypT(T att_TypT) {
		this.att_TypT = att_TypT;
	}

	public U getAtt_TypU() {
		return att_TypU;
	}

	public void setAtt_TypU(U att_TypU) {
		this.att_TypU = att_TypU;
	}

	@Override
	public String toString() {
		return "Paar [att_TypT=" + att_TypT + ", att_TypU=" + att_TypU + "]";
	}

	@Override
	public void setMarke(String m) {
		this.marke = m;
		
	}

	@Override
	public String getMarke() {
		return this.marke;
	}

    public static void print(Paar<?,?> p) {
		System.out.println("print mit Wildcard: (" + p.getAtt_TypT() + ", " + p.getAtt_TypU() + ")");
	}

	public static double sum(Paar<? extends Number, ? extends Number> p) {
		double sum = p.getAtt_TypT().doubleValue() + p.getAtt_TypU().doubleValue();
		return sum;
	}

    public static <N extends Number, M extends Number> double sumGeneric(Paar<N, M> p) {
		double sum = p.getAtt_TypT().doubleValue() + p.getAtt_TypU().doubleValue();
		return sum;
	}
}
