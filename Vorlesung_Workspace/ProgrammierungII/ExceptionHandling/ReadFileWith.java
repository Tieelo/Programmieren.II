package ProgrammierungII.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWith {
    public static void main(String[] args) {
	    try {
	        File myObj = new File("myFile.txt");
	        System.out.println("abs path :" + myObj.getAbsolutePath());
	        System.out.println("abs file :" + myObj.getAbsoluteFile());
	        Scanner myReader = new Scanner(myObj);
	        System.out.println("after scanner init");
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("Attention! An error occurred.");
	        e.printStackTrace();
	      }

	}
}
