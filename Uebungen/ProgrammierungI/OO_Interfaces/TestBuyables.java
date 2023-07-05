package ProgrammierungI.OO_Interfaces;

public class TestBuyables {
    public static void main(String[] args) {
        Magazine spiegel = new Magazine();
        spiegel.price = 2.50;
        Buyable schoki = new Chocolate();
        Magazine titanic = new Magazine();
        titanic.price = 3.00;
        System.out.printf("%.2f", PriceUtils.calculateSum(spiegel, titanic, schoki));
    }
}
