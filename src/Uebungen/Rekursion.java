package Uebungen;
import java.math.BigInteger;
import java.util.Objects;

public class Rekursion {
    public static void main(String[] args) {
        //einfacheReihe(ende);
        //quadratischeReihe(ende);
        BigInteger iterations = new BigInteger("64");
        chess(iterations);
        System.out.println(chessShort(64));
        //einHalb(5);
        //System.out.println(quadratisch(5));
    }
    public static int einfacheReihe(int n) {
        if (n == 1) {
            return 1;
        } else {
            //int temp = n + einfacheReihe(n - 1);
            //System.out.println(temp);
            return n + einfacheReihe(n - 1);
        }
    }
    public static int quadratischeReihe(int n) {
        if (n == 1) {
            return 1;
        } else {
            int temp = n * quadratischeReihe(n - 1);
            System.out.println();
            return temp;
        }
    }
    public static BigInteger chess(BigInteger n) {
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");
        if (Objects.equals(n, one)){
            return one;
        }else{
            BigInteger neu;
            neu = two.multiply(chess(n.subtract(one)));
            System.out.println(neu);
            return neu;
        }
    }
    public static long chessShort(long n){
        if (n == 1){
            return 1;
        }else{
            long temp = 2* chessShort(n-1);
            System.out.println(temp);
            return temp;
        }
    }
    public static double einHalb(double n){
        if (n == 0){
            return 1;
        }else{
            double temp = 0.5 * einHalb(n -1);
            System.out.println(temp);
            return temp;
        }
    }
    public static long quadratisch(long n){
        long temp;
        if (n==1){
            return 1;
        }else{
            temp = quadratisch(n-1) + 2 * n -1;
            //System.out.println(temp);
            return temp;
        }
    }
}
