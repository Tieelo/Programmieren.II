package FunktionaleProgrammierung.LambdaAusdruecke;

public class LambdasImplementingFIs {
    public static void main(String[] args) {
        X myX = (() -> System.out.println("Lambda says Hello World!"));
        Y myY = ((a) -> {return (double)a/2;});
        calcY(myY, 5);
        // Z myZ = ,
    }
    private static void calcY (Y y, int i) {
        // hier koennte viel Code stehen, der immer gleich bleibt
        // nur die naechste Zeile ist flexibel (je nach y)
        System.out.println(y.abstrMethod(i));
        // hier koennte viel Code stehen, der immer gleich bleibt
    }
}
