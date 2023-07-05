package ProgrammierungI.Kontrollstrukturen;

import java.util.Scanner;

public class Kontostand_Bewertung1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        System.out.print("Input your account balance: ");
        int kontostand = in.nextInt();

        if (kontostand > 0) {
            System.out.print("Kontostand positiv");
        } else {
            System.out.print("insolvent");
        }

        in.close();
    }
}
