package ProgrammierungI.OO_Vererbung;

public class TestUnterscheideAbstraktUndNichtAbstrakt {
    public static void main(String[] args) {
        BspKonkreteKlasse k = new BspKonkreteKlasse();
        //BspAbstrakteKlasse a = new BspAbstrakteKlasse();
        SubKlasse s = new SubKlasse();
        s.something();
        s.hello();
    }
}
