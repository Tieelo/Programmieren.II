package ProgrammierungII.Generics;

public class G_Box<T> implements Markierbar<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	@Override 
	public T getMarke(){
		return this.value;
	}
	@Override
	public void setMarke(T m){
		this.value = m;
	}
}

