package ProgrammierungI.Erstklausur.vermietung;

public class Vermieter {
    public static double mieteSummieren(Mieter... mieter) {
        double result = 0.0;
        for (Mieter m : mieter) {
            result += m.zahleMiete();
        }
        return result;
    }
}
