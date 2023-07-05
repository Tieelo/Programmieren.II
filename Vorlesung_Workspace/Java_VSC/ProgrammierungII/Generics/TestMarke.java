package ProgrammierungII.Generics;

public class TestMarke {
    public static void main(String[] args) {
        G_Box<String> g_box_string = new G_Box<>();
        G_Box<Integer> g_box_int = new G_Box<>();
        g_box_string.setMarke("abc");
        System.out.println("String-Box: " + g_box_string.getMarke());
        g_box_int.setMarke(123);
        System.out.println("Integer-Box: " + g_box_int.getMarke());

        Paar<Integer,Double> paar = new Paar<>();
        paar.setAtt_TypT(123);
        paar.setAtt_TypU(7.3);
        System.out.println("Typ U: " + paar.getAtt_TypU() + "Typ T: " + paar.getAtt_TypT());
        paar.setMarke("ABC");
        System.out.println("Marke: " + paar.getMarke());
    }
}
