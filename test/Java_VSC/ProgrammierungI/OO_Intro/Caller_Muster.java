package ProgrammierungI.OO_Intro;

public class Caller_Muster {
    public static void main(String[] args) {
        Dog_firstDraft dog1a = new Dog_firstDraft();
        Dog_firstDraft dog1b = new Dog_firstDraft();
        //Dog_withExplicitConstructor dog2a = new Dog_withExplicitConstructor();
        //Dog_withExplicitConstructor dog2b = new Dog_withExplicitConstructor();
        Dog_constructorWithArgs dog3a = new Dog_constructorWithArgs("Terrier", "small", 7, "brown");
        Dog_constructorWithArgs dog3b = new Dog_constructorWithArgs("Pudel", "medium", 3, "silver");
        Dog dog4a = new Dog("Dachshound", 1, 14, "black");
        Dog dog4b = new Dog("white");
        System.out.println(dog4b);
    }
}
