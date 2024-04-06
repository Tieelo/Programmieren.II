package Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoAgain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (int i = 0; i < 6; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
