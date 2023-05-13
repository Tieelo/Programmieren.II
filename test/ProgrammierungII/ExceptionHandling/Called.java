package ProgrammierungII.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Called {
    public static void readFile() throws FileNotFoundException {
        File myObj = new File("myFil6e.txt");
	    Scanner myReader = new Scanner(myObj);
	    while (myReader.hasNextLine()) {
	      System.out.println(myReader.nextLine());
	    }
	    myReader.close();
    }
}
