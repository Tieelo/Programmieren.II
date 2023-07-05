package ExceptionHandling.self;

import java.io.*;
import java.util.Scanner;

public class Dateileser {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("resources/text.txt");
        Scanner myReader = new Scanner(myObj);
        int a = 1;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}
