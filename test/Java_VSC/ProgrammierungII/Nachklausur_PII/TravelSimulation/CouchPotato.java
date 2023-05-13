package ProgrammierungII.Nachklausur_PII.TravelSimulation;

public class CouchPotato extends Person {

    public CouchPotato() {
        this.setTravelBehaviour(new AutoFahren());
    }

    @Override
    public void display() {
        System.out.print("Ich spar mir die Mühe und ");
    }
    
}
