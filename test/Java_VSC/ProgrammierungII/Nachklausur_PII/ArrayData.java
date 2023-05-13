package ProgrammierungII.Nachklausur_PII;

import java.util.Scanner;

public class ArrayData {
    public static void main(String[] args) {
        int[] arr = {7, 13, 1, -4, -25, 101};

        Scanner myObj = new Scanner(System.in);
        System.out.print("Geben Sie ein, von welcher Position Sie das Element sehen moechten: ");
        int index = myObj.nextInt();
        try {
            System.out.print(arr[index]);
            System.out.println(" ist das gewuenschte Element.");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Dieser Index entspricht nicht der Array-Größe.");
        }
        myObj.close();
	}
}
