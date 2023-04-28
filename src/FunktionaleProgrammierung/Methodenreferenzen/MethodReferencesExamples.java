package FunktionaleProgrammierung.Methodenreferenzen;

import java.util.function.BiFunction;

// https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

public class MethodReferencesExamples {
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }
    
    public static String appendStringsStatic(String a, String b) {
        return a + b;
    }
    
    public String appendStringsInstanceMethod(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodReferencesExamples myApp = new MethodReferencesExamples();

        System.out.println(MethodReferencesExamples.
            mergeThings("Hello ", "lambda expression!", (a, b) -> a + b));
        
        System.out.println(MethodReferencesExamples.
            mergeThings("Hello ", "static method!", MethodReferencesExamples::appendStringsStatic));
       
        System.out.println(MethodReferencesExamples.
            mergeThings("Hello ", "instance method of a particular object!", myApp::appendStringsInstanceMethod));
        
        System.out.println(MethodReferencesExamples.
            mergeThings("Hello ", "instance method of an arbitrary object of a particular type!", String::concat));
    }
}
