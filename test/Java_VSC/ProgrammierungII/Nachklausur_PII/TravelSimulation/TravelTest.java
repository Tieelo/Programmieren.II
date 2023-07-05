package ProgrammierungII.Nachklausur_PII.TravelSimulation;

public class TravelTest {
    public static void main(String[] args) {
        Person couch = new CouchPotato();
        couch.performTravel();

        Person sport = new Sportskanone();
        sport.performTravel();

        // die CouchPotato-Person steigt auf die Straßenbahn um:
        couch.setTravelBehaviour(new StrassenbahnFahren());
        couch.performTravel();
       
        // die Sportskanone steigt auf das Fahrrad um:
        sport.setTravelBehaviour(new FahrradFahren());
        sport.performTravel();
    }
}
