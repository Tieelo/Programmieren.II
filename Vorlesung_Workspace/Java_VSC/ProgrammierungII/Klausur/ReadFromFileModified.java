package ProgrammierungII.Klausur;

import java.io.*;
import java.util.Scanner;

public class ReadFromFileModified {
    public static void main(String[] args) {
        System.out.println("Hier der Pfad " + System.getProperty ("user.dir"));
            File myObj = new File("myFiwle.txt");
            try (Scanner myReader = new Scanner(myObj)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }
}
