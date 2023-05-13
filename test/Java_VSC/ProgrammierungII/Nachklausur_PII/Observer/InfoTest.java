package ProgrammierungII.Nachklausur_PII.Observer;

public class InfoTest {
    public static void main(String[] args) {
        Observer tv = new Empfaenger();
        Observer maske = new Empfaenger();
        Institut rki = new Institut();

        rki.registerObserver(tv);
        rki.registerObserver(maske);

        rki.setNumber(123);
        rki.setNumber(88);
        System.out.println("Remove TV");
        rki.removeObserver(tv);
        rki.setNumber(500);
        rki.setNumber(499);
    }
}
