package ProgrammierungII.factoryAbstract_Schuhfabrik;

public class GucciSchuhFabrik implements Schuhfabrik {

    @Override
    public Schuh erzeugeSchuh(String schuhArt) {
        if (schuhArt.equals("T")) {
            return new GucciTurnSchuh();
        } else if (schuhArt.equals("W")) {
            return new GucciWanderSchuh();
        }
        return null;
    }
    
}
