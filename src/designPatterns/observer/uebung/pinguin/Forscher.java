package designPatterns.observer.uebung.pinguin;

public class Forscher implements Beobachter{
    private String name;
    private Pinguin pinguin;
    public Forscher(Pinguin pinguin, String name){
        this.pinguin = pinguin;
        this.name = name;
        pinguin.registerObserver(this);
    }
    @Override
    public void update() {
        String action = pinguin.getAction();
        System.out.printf("Der Forscher %s sieht, dass der Pinguin gerade %s \n", name, action );
    }
}
