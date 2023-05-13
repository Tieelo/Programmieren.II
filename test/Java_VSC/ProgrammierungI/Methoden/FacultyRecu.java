package ProgrammierungI.Methoden;

public class FacultyRecu {
    public static void main(String[] args) throws Exception {
        System.out.println(faculty(5));
    }

    public static int faculty(int n) throws Exception {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new Exception("Negative Zahlen nicht erlaubt.");
        } else {
            return n * faculty(n - 1);
        }
        
    }
}
