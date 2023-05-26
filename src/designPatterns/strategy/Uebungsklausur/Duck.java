package designPatterns.strategy.Uebungsklausur;

public abstract class Duck{

    static Flugverhalten flugverhalten;

    public Duck(){
    }
    public void setFlugverhalten(Flugverhalten fv){
        flugverhalten = fv;
    }
    public void abheben(){
        flugverhalten.abheben();
    }
    public void landen(){
        flugverhalten.landen();
    }
    public void kurshalten(){
        flugverhalten.kurshalten();
    }
}
