package ProgrammierungII.Generics.Container;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Apfel");
        myLinkedList.add("Banana");
        myLinkedList.add("Erdbeere");
        System.out.println(myLinkedList);
        myLinkedList.remove("Banana");
        System.out.println(myLinkedList);
    }
}
