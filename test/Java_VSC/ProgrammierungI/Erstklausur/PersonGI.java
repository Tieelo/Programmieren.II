package ProgrammierungI.Erstklausur;
//Abgabe von GI
public class PersonGI {
    private String name;
    private String geschlecht;
    private String beruf;

    public PersonGI(String name, String geschlecht, String beruf) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.beruf = beruf;
        if (geschlecht == "") {
            this.geschlecht = "divers";
        }
        if (beruf == "") {
            this.beruf = "IT-Fachkraft";
        }
    }

    public void datenAusgeben() {
        System.out.println("PersonGI [name=" + name + ", geschlecht=" + geschlecht + ", beruf=" + beruf + "]");
    }

    
}
