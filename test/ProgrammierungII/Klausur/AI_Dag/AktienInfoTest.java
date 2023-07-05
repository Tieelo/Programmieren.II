package ProgrammierungII.Klausur.AI_Dag;

public class AktienInfoTest {
    public static void main(String[] args) {
        AktionaereGut alice = new AktionaereGut();
        alice.display();
        alice.performInformation();
        alice.performSchlechteInfos();
        AktionaereGut bob = new AktionaereGut();
        bob.display();
        bob.performInformation();
        bob.performSchlechteInfos();
    }
}
