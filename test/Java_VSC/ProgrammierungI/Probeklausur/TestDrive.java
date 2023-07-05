package ProgrammierungI.Probeklausur;

public class TestDrive {
    public static void main(String[] args) {
        VoltCruiser vc1 = new VoltCruiser(35, "K-101");
        VoltCruiser vc2 = new VoltCruiser(12, "D-401");
        vc1.laden(7);
        vc1.fahren(43);
    }
}
