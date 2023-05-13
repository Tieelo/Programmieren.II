package ProgrammierungI.Arrays;

public class PassToMain {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
