package ProgrammierungI.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        // Fehler! System.out.println(arr[10]);
        arr[0] = 7;
        arr[1] = 2;
        arr[2] = 8;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum);
        System.out.println(sum/arr.length);
    }
}
