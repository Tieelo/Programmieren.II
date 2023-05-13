package ProgrammierungII.enumSingleton;

public class SingletonClient {
    public static void main(String args[]) {
        ChocolateBoiler cb = ChocolateBoiler.UNIQUE_INSTANCE;
        cb.describeState();
        cb.fill();
        cb.describeState();
        cb.boil();
        cb.describeState();
        cb.drain();
        cb.describeState();
    }
}
