package ProgrammierungII.Klausur.DC;

public class CarpenterTest {
    public static void main(String[] args) {
    Furniture table = new Table();
    System.out.println(table.getDescription() + "; costs: " + table.cost() + " Euros.");
    // varnish the table
    table = new Varnishing(table);
    System.out.println(table.getDescription() + "; costs: " + table.cost() + " Euros.");
    
    Furniture chair = new Chair();
    System.out.println(chair.getDescription() + "; costs: " + chair.cost() + " Euros.");
    // varnish the chair
    chair = new Varnishing(chair);
    System.out.println(chair.getDescription() + "; costs: " + chair.cost() + " Euros.");
    }
}
