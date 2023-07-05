package ProgrammierungI.Arrays;

public class Introduction {
    public static void main(String[] args) {
        double[] arr = {1, 2, 9.3, 3, 100, 5, 100, -200, 100};
        System.out.println(avg1(arr));
        // etwas praktischer hier: einfach die Werte hintereinander als Argument"sequenz" übergeben
        //System.out.println(avg2(1, 2, 9.3, 3, 100, 5, 100, -200, 100));
        // int[] result = productAndSum(10, 7);
        // System.out.println(result[0] + " " + result[1]);
        // for (int i : result) {
        //     System.out.println(i);
        // }
    }

    static int[] productAndSum(int a, int b) {
        return new int[] { a * b, a + b };
    }

    static double avg1(double[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array null oder leer");
        double sum = 0;
        for (double n : array) {
            sum += n;
        }
        return sum / array.length;
    }

    static double avg2(double... array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array null oder leer");
        double sum = 0;
        for (double n : array)
            sum += n;
        return sum / array.length;
    }
}
