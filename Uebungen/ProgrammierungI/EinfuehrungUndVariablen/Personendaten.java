package ProgrammierungI.EinfuehrungUndVariablen;

public class Personendaten {
    public static void main(String[] args) {
        int age = 22;
        boolean hatFuehrerschein = true;
        boolean isVolljaehrig = (age >= 18);
        System.out.println("Die Person hat folgende Eigenschaften: Alter: " + age
         + ", Fahrerlaubnis: " + hatFuehrerschein + " und volljährig: " + isVolljaehrig);
    }
}
