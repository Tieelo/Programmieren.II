package ProgrammierungII.Nachklausur_PII.Observer;

public class Empfaenger implements Observer {
    int oldNumber = 0;

    @Override
    public void update(int infZahl) {
        if (infZahl > oldNumber) {
            System.out.println("Achtung!");
        }
        else if (infZahl == oldNumber) {
            System.out.println("---");
        }
        else if (infZahl < oldNumber) {
            System.out.println("Entspannung");
        }
        oldNumber = infZahl;
    }
    
}
