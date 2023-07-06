package Klausur.HaseUndFuchs;

public class Fuchs implements Observer{
    private String name;
    private Hase hase;

    public Fuchs(Hase hase, String name){
        this.hase = hase;
        this.name = name;
        hase.registerObserver( this);
    }
    @Override
    public void update() {
        String action = hase.getAction();
        if (action.equalsIgnoreCase("bewegen")){
            System.out.printf("Hase %s: Der %s greift an\n",action, name);
        } else {
            System.out.printf("Hase %s: Der %s tut nichts\n",action, name);
        }
    }
}
