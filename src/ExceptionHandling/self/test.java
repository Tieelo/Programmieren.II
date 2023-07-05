package ExceptionHandling.self;

public class test {
    public static void main(String[] args) {
        int number = 42;
        Object o = number;
        //String s = (String) o;
        System.out.println(number);
        System.out.println(o);
        System.out.println((Integer) o);
    }
}
