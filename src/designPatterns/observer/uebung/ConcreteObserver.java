package designPatterns.observer.uebung;

public class ConcreteObserver implements Observer{
    private int value;
    private Subject concreteSubject;

    public void ConcreteSubject(Subject concreteSubject){
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
    }
    public void update(int value){
        this.value = value;
        display();
    }

    public void display(){
        System.out.println("Value" + value);
    }
}
