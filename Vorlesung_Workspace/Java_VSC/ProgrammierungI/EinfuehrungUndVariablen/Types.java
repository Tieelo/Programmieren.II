package ProgrammierungI.EinfuehrungUndVariablen;

public class Types {
    public static void main(String[] args) {
        int a = 7;
        System.out.println("Variable a hat den Wert " + a);
        boolean flag = true;
        System.out.println("Variable flag hat den Wert " + flag);
        //flag = 87; // Error!
        char c = 'r';
        System.out.println("Variable c hat den Wert " + c);
        c = 14; // oder 11,12 // Überraschung!
        System.out.println("Variable c hat den Wert " + c);
        byte b = 4;
        System.out.println("Variable b hat den Wert " + b);
        // b = 1234; // Error!
        short s = 123;
        System.out.println("Variable s hat den Wert " + s);
        // s = 2.43; // Error!
    }
}
