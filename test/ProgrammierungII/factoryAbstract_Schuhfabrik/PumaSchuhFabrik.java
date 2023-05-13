package ProgrammierungII.factoryAbstract_Schuhfabrik;

public class PumaSchuhFabrik implements Schuhfabrik {

    @Override
    public Schuh erzeugeSchuh(String schuhArt) {
        if (schuhArt.equals("T")) {
            return new PumaTurnSchuh();
        }
        else if (schuhArt.equals("W")) {
            return new PumaWanderSchuh();
        }
        return null;
    }
    
}
