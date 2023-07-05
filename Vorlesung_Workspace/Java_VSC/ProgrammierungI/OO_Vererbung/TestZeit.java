package ProgrammierungI.OO_Vererbung;

public class TestZeit {
    public static void main(String[] args) {
        Zeit z = new TageMuster(3);
        System.out.println(z.getSekunden());
        z = new Stunden(4);
        System.out.println(z.getSekunden());
    }
}
