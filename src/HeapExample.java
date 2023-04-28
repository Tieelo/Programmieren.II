public class HeapExample {
    public static void main(String[] args) {
        int[] integerArray = new int[5]; // Erstellt ein Array von 5 Integern
        String greeting = new String("Hello"); // Erstellt ein String-Objekt
        Object objectInstance = new Object(); // Erstellt ein Objekt der Klasse Object

        // Ausgabe der Speicheradressen und Datentypen auf dem Heap
        printVariables(integerArray, greeting, objectInstance);

        // Ausgabe der Gesamtgröße des Heaps
        long heapSize = Runtime.getRuntime().totalMemory();
        System.out.println("Gesamtgröße des Heaps: " + heapSize + " Bytes");

        // Ausgabe der Variablen in main()
        System.out.println("integerArray: Speicheradresse " + integerArray);
        System.out.println("greeting: Speicheradresse " + greeting);
        System.out.println("objectInstance: Speicheradresse " + objectInstance);
    }

    public static void printVariables(int[] integerArray, String greeting, Object objectInstance) {
        // Ausgabe der Speicheradressen und Datentypen auf dem Heap
        System.out.println("integerArray: Speicheradresse " + integerArray);
        System.out.println("greeting: Speicheradresse " + greeting);
        System.out.println("objectInstance: Speicheradresse " + objectInstance);
    }
}