package ALGO;
import java.util.*;
public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 5; i >= 0; i--) {
            queue.offer(i);
            System.out.println(queue);
        }
        System.out.println(queue.peek() + "\n");

        System.out.println();
        System.out.println(queue);

        queue.remove();
        System.out.println();
        System.out.println(queue);
        }
    }