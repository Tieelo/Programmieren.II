package ProgrammierungII.functionalProgramming;

public class faculty {
    public static void main(String args[]) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
