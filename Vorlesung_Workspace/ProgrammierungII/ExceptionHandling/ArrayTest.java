package ProgrammierungII.ExceptionHandling;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        // int[] arr = new int[5];
        char[] arr = {'-', 'a', 'b', 'c', 'd'};
        Scanner input = new Scanner(System.in);
        System.out.print("Input index: ");
        int index = input.nextInt();
        input.close();
        if (index < 0 || index >= arr.length ) {
            System.out.println("UNgültiger Wert");
        } else {
            System.out.println("Element " + index + " = " + arr[index]);
        }
        System.out.println("Programmende");
    }
}
