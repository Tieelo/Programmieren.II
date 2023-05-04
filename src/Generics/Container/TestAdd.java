package Generics.Container;

import java.util.ArrayList;
import java.util.List;

public class TestAdd {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add(0, "Element 1");
        myList.add(1, "Element 2");
        System.out.println(myList);
        myList.add(0, "Element extra");
        System.out.println(myList);
        
    }
}
