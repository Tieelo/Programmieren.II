package ProgrammierungI.Erstklausur.vermietung;

public class TestVermietung {
    public static void main(String[] args) {
        Aerztin anna = new Aerztin();
        Rentner richard = new Rentner();
        Kind kai = new Kind();

        System.out.println(kai.zahleMiete());
        System.out.println(Vermieter.mieteSummieren(anna, richard, kai));
    }
}
