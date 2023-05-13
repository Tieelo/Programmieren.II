package ProgrammierungII.Generics;

public class Bivarianz {
    public static void main(String[] args) {
        G_Box<String> sbox = new G_Box<>();
        sbox.setValue("Hugo Meier");
        print(sbox);
        G_Box<Integer> ibox = new G_Box<>();
        ibox.setValue(4711);
        print(ibox);
        G_Box<?> box = ibox;
        // box.setValue(123);
        box.setValue(null);
        Object o = box.getValue();
        print(box);
    }

    public static void print(G_Box<?> box) {
        Object obj = box.getValue();
        if (obj == null)
            System.out.println("Box ist leer");
        else
            System.out.println("Inhalt: " + obj);
    }
}
