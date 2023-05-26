package designPatterns.strategy.Uebungsklausur;

public class Uebungsklausur {
    public static void main(String[] args) {
        Duck ente1 = new ente1();

        ente1.setFlugverhalten(new NatuerlichesFliegen());
        ente1.abheben();
        ente1.kurshalten();
        ente1.landen();

        System.out.println("ente1 steigt jetzt ins flugzeug");

        ente1.setFlugverhalten(new FlugzeugFliegen());
        ente1.abheben();
        ente1.kurshalten();
        ente1.landen();
    }
}
