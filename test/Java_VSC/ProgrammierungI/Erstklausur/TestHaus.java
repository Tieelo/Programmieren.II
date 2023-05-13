package ProgrammierungI.Erstklausur;

public class TestHaus {
    public static void main(String[] args) {
        Haus h1 = new Haus("Holz");
        Haus h2 = new Haus("Bauxit");
        System.out.println(h1.getBaustoff());
        System.out.println(h2.getBaustoff());
        System.out.println(Haus.baufirma);
        System.out.println(h1.baufirma);
        h1.info();;
        Haus.info();
    }
}
