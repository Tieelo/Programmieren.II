import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello world!");
        //returnIndex();
        fileReader();
        System.out.println("Programmende");

    }
    public static void fileReader() throws FileNotFoundException {
        File myObj = new File("resources/text.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);

        }
    }
    public static void returnIndex(){
        Scanner in = new Scanner(System.in);
        int[] randomArray = {4, 6, 8, 27, 18, 14, 101, 42 };
        int indexAbfrage;
        System.out.println("Bitten geben sie eine Zahl von 1-8 ein um das Array ab zu fragen");
        indexAbfrage = Integer.parseInt(in.next())-1;
        System.out.println("Der Wert an der Stelle "+indexAbfrage+" beträgt: "+randomArray[indexAbfrage]);
    }

}