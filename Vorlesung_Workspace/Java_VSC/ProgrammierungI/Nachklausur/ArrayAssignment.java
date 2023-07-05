package ProgrammierungI.Nachklausur;

public class ArrayAssignment {
    public static void main(String[] args) {
        int b = 123;
        int a;
        a = b;
        b = 987;
        System.out.println("a = " + a);
        
        int[] c = new int[1];
        int[] d = new int[1];
        d[0] = 12;
        c = d;
        d[0] = 18;
        System.out.println("c[0] = " + c[0]);
    }
}
