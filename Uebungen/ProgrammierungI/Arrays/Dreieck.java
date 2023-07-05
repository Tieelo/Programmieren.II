package ProgrammierungI.Arrays;

public class Dreieck {

    public static void main(String[] args) {
        pascalsJM();
        pascalInsel();
    }

    static void pascalsJM() {
        int n = 17;
        int[][] pascal = new int[n][];

        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
        }

        System.out.println("Dimensionen sind " + pascal.length + " und:");

        for (int i = 0; i < pascal.length; i++) {
            System.out.println(pascal[i].length);
        }

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                int obenLinks = 0;
                int obenRechts = 0;
                if (i > 0) {
                    if (j > 0) {
                        obenLinks = pascal[i - 1][j - 1];
                    }
                    if (j < pascal[i].length - 1) {
                        obenRechts = pascal[i - 1][j];
                    }
                }
                pascal[i][j] = obenLinks + obenRechts;
                if (obenLinks == 0 || obenRechts == 0) {
                    pascal[i][j] = 1;
                }
            }
        }

        System.out.println("Ergebnis mit Werten: ");

        for (int i = 0; i < pascal.length; i++) {
            System.out.print(new String(new char[(2 * pascal.length - i * 2)]).replace('\0', ' '));
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void pascalInsel() {
        int[][] triangle = new int[7][];

        for (int row = 0; row < triangle.length; row++) {
            System.out.print(new String(new char[(14 - row * 2)]).replace('\0', ' '));
            triangle[row] = new int[row + 1];

            for (int col = 0; col <= row; col++) {
                if ((col == 0) || (col == row))
                    triangle[row][col] = 1;
                else
                    triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
                System.out.printf("%3d ", triangle[row][col]);
            }
            System.out.println();
        }
    }
}
