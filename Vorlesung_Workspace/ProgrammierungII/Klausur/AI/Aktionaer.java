package ProgrammierungII.Klausur.AI;

public class Aktionaer implements Observer {
    double oldPrice;

    @Override
    public void update(double price) {
        if (price >= oldPrice) {
            System.out.println(":)");
        } else {
            System.out.println("!?###xx!");
        }
        oldPrice = price;
        
    }
    
}
