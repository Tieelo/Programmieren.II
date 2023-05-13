package ProgrammierungI.OO_Interfaces;

public class PriceUtils {
    static double calculateSum(Buyable first, Buyable... more) {
        double result = first.price();
        for (Buyable buyable : more)
            result += buyable.price();
        return result;
    }
}
