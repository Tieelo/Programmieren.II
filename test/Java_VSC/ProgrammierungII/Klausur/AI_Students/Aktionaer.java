package ProgrammierungII.Klausur.AI_Students;

public class Aktionaer implements Observer {
    private double lastPrice;
    private final Aktie aktie;

    public Aktionaer(Aktie aktie) {
        this.aktie = aktie;
        this.lastPrice = this.aktie.getPreis();
    }

    @Override
    public void update() {
        double price = aktie.getPreis();
        if (price >= this.lastPrice) {
            System.out.println(":)");
        } else {
            System.out.println("!?###xx!");
        }
        this.lastPrice = price;
    }
    
}
