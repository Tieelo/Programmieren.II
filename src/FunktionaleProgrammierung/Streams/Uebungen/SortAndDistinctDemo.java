/*      Eine Folge von endlich vielen ganzen Zahlen soll sortiert und doppelte Einträge sollen entfernt werden.
        Nutzen Sie hierzu die java.util.stream.Stream-Methode
        static <T> Stream<T> of(T... values),
        die Methode sorted(...) sowie die Methode
        Stream<T> distinct().
        Zeigen Sie das Ergebnis am Bildschirm an.*/

package FunktionaleProgrammierung.Streams.Uebungen;

import java.util.List;
import java.util.Random;

public class SortAndDistinctDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> numbers = rand.ints(10, 0, 100)
                .boxed()
                .toList();

        List<Integer> sortedDistinctNumbers = numbers.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println("Sorted and distinct numbers: " + sortedDistinctNumbers);
    }
}
