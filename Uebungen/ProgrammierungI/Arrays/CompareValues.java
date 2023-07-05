package ProgrammierungI.Arrays;

public class CompareValues {
    public static void main(String[] args) {
        int b = 2;
        int a = b;
        b = 4;
        // Welchen Wert hat a an dieser Stelle?
        System.out.println("a = " + a);

        int[] c = new int[1];
        int[] d = new int[1];
        d[0] = 20;
        c = d;
        d[0] = 40;
        // Welchen Wert hat c[0] an dieser Stelle?
        System.out.println("c[0] = " + c[0]);
        //System.out.println("gibt es c[1] = " + c[1]);
    }
}
