package ProgrammierungII.Generics;

public class M_Box<T> implements Markierbar<T> {
	private T value;
	protected T marke;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	@Override
	public void setMarke(T m) {
		this.marke = m;
	}

	@Override
	public T getMarke() {
		return this.marke;
	}
}
