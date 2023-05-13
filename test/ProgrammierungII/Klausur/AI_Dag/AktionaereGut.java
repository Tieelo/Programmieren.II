package ProgrammierungII.Klausur.AI_Dag;

public class AktionaereGut extends Aktionaere {

    public AktionaereGut() {
        information = new InfoMitPreis();
    }

    @Override
    public void display() {
        System.out.println(":)");
    }
    
}
