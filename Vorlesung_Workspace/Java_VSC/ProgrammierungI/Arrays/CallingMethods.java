package ProgrammierungI.Arrays;

public class CallingMethods {
    public static void main(String[] args) {
        method1(432);
        for(String string :args){
            System.out.print(string + "-----");
        }
    }

    public static void method1(int a) {
        System.out.println(a);
    }
}
