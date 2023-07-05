package Generics.self;

public class Paar<T, U> {
    private T a;
    private U b;

    public Paar(T a, U b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public U getB() {
        return b;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(U b) {
        this.b = b;
    }
}
