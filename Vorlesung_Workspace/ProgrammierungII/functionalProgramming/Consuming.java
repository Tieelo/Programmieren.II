package ProgrammierungII.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consuming {
    static List<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        list.add("Anna");
        list.add("Bernd");
        list.add("Claus");
        squaring();
        //listConsumption();
        //oneAfterTheOther();
    }

    private static void squaring() {
        Consumer<Integer> squarer = i -> System.out.println("Quadrat ist " + i * i);
        squarer.accept(17);
    }

    public static void listConsumption() {
        Consumer<String> printer = n -> System.out.println(n + " ###");
        list.forEach(printer);
    }

    public static void oneAfterTheOther() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Adam", 25));
        studentList.add(new Student("Barbara", 34));
        studentList.add(new Student("Danny", 12));

        Consumer<Student> increaseMark = s -> s.setMark(s.getMark() + 3);
        Consumer<Student> printer = s -> System.out.println(s.getName() + ", " + s.getMark());
        Consumer<Student> combiConsumer = increaseMark.andThen(printer);
        studentList.forEach(combiConsumer);
    }
}
