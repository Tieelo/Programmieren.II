package ProgrammierungII.functionalProgramming;

public class StringTest {
    public static void main(String args[]) {
        String s = "rfhKoeln";
        // System.out.println(s.toUpperCase());
        // System.out.println(s);
        System.out.println(convertToUp(s));
        System.out.println(s);
    }

    private static String convertToUp(String a) {
        a = a.toUpperCase();
        return a;
    }
}
