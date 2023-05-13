package ProgrammierungI.OO_Intro;

public class ClassWithPrivateSalary_Demo {
    private int salary;

    public int getSalary() {
        // Berechtigungen? Authorisierung?
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 0)
        {
            this.salary = salary;
        } else {
            System.out.println("bitte keine negativen Werte eingeben");
        }
    }

}
