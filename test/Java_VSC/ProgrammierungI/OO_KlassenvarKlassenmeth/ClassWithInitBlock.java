package ProgrammierungI.OO_KlassenvarKlassenmeth;

// https://im-coder.com/was-ist-ein-initialisierungsblock.html

public class ClassWithInitBlock {
    static int staticVariable;
    int nonStaticVariable;        

    //Static initialization block:
    //Runs once (when the class is initialized)
    static {
        System.out.println("Static initalization.");
        staticVariable = 5;
    }

    //Instance initialization block:
    //Runs each time you instantiate an object
    {
        System.out.println("Instance initialization.");
        nonStaticVariable = 7;
    }

    public ClassWithInitBlock() {
        System.out.println("Constructor.");
    }
}

// in main
//new ClassWithInitBlock();
//new ClassWithInitBlock();