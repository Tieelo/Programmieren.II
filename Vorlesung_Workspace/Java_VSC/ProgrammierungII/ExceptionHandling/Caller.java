package ProgrammierungII.ExceptionHandling;

import java.io.FileNotFoundException;

public class Caller {
    public static void main(String[] args) throws FileNotFoundException {
        Called.readFile();
        System.out.println("Sie haben das Programmende erreicht.");
    }
}
