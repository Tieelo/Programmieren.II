package Klausur.Fortbewegunsmittel.FortbewegunsMittel;

public abstract class Person implements Fahrverhalten{
    static Fahrverhalten fahrverhalten;

    public Person(){
    }
    public void setFahrverhalten(Fahrverhalten fahren){fahrverhalten = fahren;}
    public void beschleunigen(){
        fahrverhalten.beschleunigen();
    }
    public void abbiegen(){
        fahrverhalten.abbiegen();
    }
    public void bremsen(){
        fahrverhalten.bremsen();
    }
}
