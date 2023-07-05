package FunktionaleProgrammierung.Uebung;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StudentConsumer {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("John", 10), new Student("Jane", 12), new Student("Bob", 8));

        Consumer<Student> increasePoints = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                student.setPoints(student.getPoints() + 3);
            }
        };

        Consumer<Student> printStudent = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName() + ": " + student.getPoints());
            }
        };

        students.forEach(increasePoints.andThen(printStudent));
    }
}
