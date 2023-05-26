package designPatterns.strategy.Uebungsklausur;

public class ente1 extends Duck {
    public ente1(){
        flugverhalten = new NatuerlichesFliegen();
    }

    public static void display() {
        System.out.println("ich bin eine Ente");
    }
}
