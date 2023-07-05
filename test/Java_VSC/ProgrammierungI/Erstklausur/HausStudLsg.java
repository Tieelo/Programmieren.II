package ProgrammierungI.Erstklausur;

public class HausStudLsg {
    private String baustoff;
    public static void main(String[] args) {
        Massivhaus mh = new Massivhaus();
        mh.setBaustoff("Plastik");
        System.out.println(mh.getBaustoff());
    }
    public String getBaustoff() {
        return baustoff;
    }
    public void setBaustoff(String baustoff) {
        this.baustoff = baustoff;
    }
    public static class Massivhaus extends HausStudLsg {
        private int stockwerke;

        public int getStockwerke() {
            return stockwerke;
        }
    }
}
