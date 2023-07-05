package ProgrammierungII.Nachklausur_PII.TravelSimulation;

public abstract class Person {
    private TravelBehaviour travelBehaviour;

    public void performTravel() {
        this.display();
        travelBehaviour.travel();
    }

    public void setTravelBehaviour(TravelBehaviour tb) {
        this.travelBehaviour = tb;
    }

    public abstract void display();
}
