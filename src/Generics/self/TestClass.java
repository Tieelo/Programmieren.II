package Generics.self;

public class TestClass {
    public static void main(String[] args) {
        Paar<Integer, Double> paar1 = new Paar<>(10, 3.14);
        print(paar1); // Output: (10, 3.14)

        Paar<Double, Integer> paar2 = new Paar<>(2.5, 7);
        print(paar2); // Output: (2.5, 7)

        double sum1 = sum(paar1);
        System.out.println("Sum 1: " + sum1); // Output: 13.14

        double sum2 = sum(paar2);
        System.out.println("Sum 2: " + sum2); // Output: 9.5
    }

    public static void print(Paar<?, ?> p) {
        System.out.println("(" + p.getA() + ", " + p.getB() + ")");
    }

    public static double sum(Paar<? extends Number, ? extends Number> p) {
        double a = p.getA().doubleValue();
        double b = p.getB().doubleValue();
        return a + b;
    }

    // Alternative Implementierung der sum-Methode ohne Wildcard-Typen
/*    public static <T extends Number, U extends Number> double sum(Paar<T, U> p) {
        double a = p.getA().doubleValue();
        double b = p.getB().doubleValue();
        return a + b;
    }*/
}
