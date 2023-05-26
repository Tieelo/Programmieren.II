package designPatterns.observer.uebung.pinguin;

public class PinguinMain {
    public static void main(String[] args) {
        Pinguin pingu = new Pinguin();

        Forscher forscherMirco = new Forscher(pingu, "Mirco");
        Forscher forscherHans = new Forscher(pingu, "Hans");

        pingu.setAction("schlaeft");
        System.out.println();
        pingu.setAction("isst");
        System.out.println();
        pingu.setAction("watschelt");
    }
}
