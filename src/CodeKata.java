import java.util.Arrays;

public class CodeKata {

    static int[] outlier = {2, 4, 0, 100, 4, 11, 2602, 36};
    static int[] outlier2 = {160, 3, 1719, 19, 11, 13, -21};

    static int outlier(int[] integers) {
        int [] odds = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int [] evens = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

        return odds.length == 1 ? odds[0] : evens[0];
    }

    public static void main(String[] args) {
        System.out.println(outlier(outlier));
        System.out.println(outlier(outlier2));
    }
}
