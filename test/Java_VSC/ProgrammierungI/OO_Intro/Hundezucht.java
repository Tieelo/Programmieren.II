package ProgrammierungI.OO_Intro;

public class Hundezucht {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("Dackel", 1, 17, "schwarz");
        dogs[1] = new Dog("Schaeferhund", 5, 15, "ocker");
        dogs[2] = new Dog("Pudel", 3, 11, "weiss");
        dogs[3] = new Dog("Bulldogge", 22, 1, "braun");
        dogs[4] = new Dog("Wolfshund", 35, 7, "schwarz");

        System.out.println("Hier die Rassen:");
        for (Dog dog : dogs) {
            System.out.println(dog.breed);
        }

        System.out.println("Hier alles:");
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("Hier die schwarzen:");
        for (Dog dog : dogs) {
            if (dog.color.equals("schwarz"))
                System.out.println(dog.breed);
        }
    }
}
