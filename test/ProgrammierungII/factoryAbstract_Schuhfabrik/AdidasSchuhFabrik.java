package ProgrammierungII.factoryAbstract_Schuhfabrik;

public class AdidasSchuhFabrik implements Schuhfabrik {

    @Override
    public Schuh erzeugeSchuh(String schuhArt) {
        if (schuhArt.equals("T")) {
            return new AdidasTurnSchuh();
        }
        else if (schuhArt.equals("W")) {
            return new AdidasWanderSchuh();
        }
        return null;
    }
    
}
