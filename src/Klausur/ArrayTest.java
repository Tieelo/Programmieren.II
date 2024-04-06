package Klausur;

import java.util.function.BinaryOperator;
public class ArrayTest {

    public static <T> T fold (BinaryOperator<T> op, T first, T... items) {

        T result = first;

        for (T item: items) {
            result = op.apply(result, item);

        }

        return result;

    }

    public static void main(String[] args) {
        String s = fold((s1, s2) -> s1 + s2,"", "a","b","c");
        System.out.println(s);
        int x = fold((s1, s2) -> s1 + s2, 1,  1, 2, 3, 4);
        System.out.println(x);
    }}