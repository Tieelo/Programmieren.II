package ProgrammierungI.Kontrollstrukturen;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LiveShareKontostand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kontostand = 100.0; // Default init
        int jahre = 3;// Default init
        double zinsen = 0.0;// Default init
        System.out.print("Geben Sie Ihren Kontostand ein: (double) ");
        try {
            kontostand = sc.nextDouble();
        } catch(InputMismatchException e) { 
            System.out.println("Error: " + e);
        }
        sc.close();
        System.out.print("Geben Sie Ihre Zinsen ein: (double) ");
        sc = new Scanner(System.in);
        try {
            zinsen = sc.nextDouble();
        } catch(InputMismatchException e) { 
            System.out.println("Error: " + e);
        }
        sc.close();
        System.out.print("Geben Sie Ihre Zinseszinzenjahre ein: (int) ");
        try {
            jahre = sc.nextInt();
        } catch(InputMismatchException e) { 
            System.out.println("Error: " + e);
        }
        sc.close();

        for(int i = 1; i <= jahre; i++) {
            kontostand += kontostand * zinsen;
            System.out.println("Kontostand nach " + i + " Jahren ist: " + kontostand);
        }
    }
}
