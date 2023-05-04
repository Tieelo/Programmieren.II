package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWith_short {
    public static void main(String[] args) {
	    try {
			// ohne Pfadangabe: Datei muss neben Projektordner liegen
	        File myObj = new File("myFile.txt");
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          System.out.println(myReader.nextLine());
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("Attention! An error occurred. Make sure the file exists");
	        e.printStackTrace();
	      }
	}
}
