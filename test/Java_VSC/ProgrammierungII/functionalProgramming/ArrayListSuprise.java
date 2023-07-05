package ProgrammierungII.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSuprise {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 99, 2));
        ints.forEach(v -> {
            System.out.println(ints + ", " + v);
            ints.set(v, 0);
        });
    }
}
