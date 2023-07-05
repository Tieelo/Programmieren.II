package ProgrammierungI.EinfuehrungUndVariablen;

public class Scope {
    public static void main(String[] args) {
        int a = 7;
        System.out.println("außen: Variable a hat den Wert " + a);
        {
            System.out.println("innen: Variable a hat den Wert " + a);
            int i = 8;
            System.out.println("innen: Variable i hat den Wert " + i);
        }
        System.out.println("außen: Variable a hat den Wert " + a);
        // System.out.println("außen: Variable i hat den Wert " + i);
    }
}
