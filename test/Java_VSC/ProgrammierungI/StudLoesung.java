package ProgrammierungI;

import java.util.Random;
import java.util.Scanner;

public class StudLoesung {

    public static void main(String[] args) throws Exception {
        Random Zahl = new Random();
        int x = Zahl.nextInt(6) + 1;

        while (x != 6) {
            System.out.println(x);
            x = Zahl.nextInt(6) + 1;

            if (x == 6) {
                System.out.println(x);
            }
        }
        // int x=Zahl.nextInt(100)+1;

        // while(x!=13) {
        // System.out.println(x);
        // x=Zahl.nextInt(100)+1;

        // if(x==13){
        // System.out.println(x);}
        // }
    }
}
