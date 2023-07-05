package ProgrammierungI.Kontrollstrukturen;

public class Treppe {
    public static void main(String[] args) {
        int h = 10;
        int b = 3;
        for (int i = 0; i < h; i++) {
            int breite = b * (i + 1);
            for (int j = 0; j < (h*b - breite); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < breite; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
