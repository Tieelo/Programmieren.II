package Generics.Container;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Tina");
        mySet.add("Jim");
        mySet.add("Tina");
        System.out.println(mySet);
    }
}
