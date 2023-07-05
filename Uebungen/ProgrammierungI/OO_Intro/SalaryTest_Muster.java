package ProgrammierungI.OO_Intro;

public class SalaryTest_Muster {
    public static void main(String[] args) {
        ClassWithPublicSalary obj = new ClassWithPublicSalary();
        obj.salary = -50000;
        System.out.println("Gehalt betraegt " + obj.salary);

        System.out.println("-----------------------------------");

        ClassWithPrivateSalary privSal = new ClassWithPrivateSalary();
        System.out.println("Gehalt betraegt " + privSal.getSalary());
        privSal.setSalary(30);
        System.out.println("Gehalt betraegt " + privSal.getSalary());
        privSal.setSalary(-50000);
        System.out.println("Gehalt betraegt " + privSal.getSalary());
    }
}
