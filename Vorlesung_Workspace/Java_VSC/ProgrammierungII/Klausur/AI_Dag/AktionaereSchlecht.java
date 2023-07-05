package ProgrammierungII.Klausur.AI_Dag;

public class AktionaereSchlecht extends Aktionaere {

    public AktionaereSchlecht() {
        schlechteInfos = new InfoMitSchlechtePreis();
    }

    @Override
    public void display() {
        System.out.println("!?");
    }
    
}
