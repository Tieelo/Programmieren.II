package ProgrammierungII.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LiveConsumer {
    public static void main(String args[]) {
        Consumer<Integer> quad = (i0) -> System.out.println(i0 * i0);
        quad.accept(7);

        List<String> names = new ArrayList<String>();
        names.add("Anna");
        names.add("Joseph");
        names.add("Khoa");
        Consumer<List<String>> lambdaForList = (list) -> list.forEach((x) -> System.out.println(x));
        Consumer<String> lambdaForElement = (a) -> System.out.println(a);
        names.forEach(lambdaForElement);
        lambdaForList.accept(names);
    }
}
