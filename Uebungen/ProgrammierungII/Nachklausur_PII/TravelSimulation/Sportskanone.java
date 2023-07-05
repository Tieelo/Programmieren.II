package ProgrammierungII.Nachklausur_PII.TravelSimulation;

public class Sportskanone extends Person {

    public Sportskanone() {
        this.setTravelBehaviour(new AutoFahren());
    }

    @Override
    public void display() {
        System.out.print("Ich bin Sportskanone und ");
    }
}
