package designPatterns.singleton.uebung;

public class ChocolateBoiler {
    public static void main(String[] args) {
        ChocolateBoilerStart cb1 = ChocolateBoilerStart.getInstance();
        ChocolateBoilerStart cb2 = ChocolateBoilerStart.getInstance();

        cb1.fill();
        cb1.boil();
        if (cb1.isBoiled()){
            System.out.println("cb1 is boiled");
        };
        if (cb2.isBoiled()){
            System.out.println("cb2 is also boiled");
        }
    }
}
