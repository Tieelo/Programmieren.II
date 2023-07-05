package ProgrammierungI.OO_Intro;

public class SalaryTest_Demo {
    public static void main(String[] args) {
        ClassWithPublicSalary pubSal = new ClassWithPublicSalary();
        pubSal.salary = 5100;
        System.out.println("Sie/Er verdient " + pubSal.salary);
        pubSal.salary = -1234;
        System.out.println("Sie/Er verdient " + pubSal.salary);

        ClassWithPrivateSalary_Demo privSal = new ClassWithPrivateSalary_Demo();
        privSal.setSalary(11);

        System.out.println("----------------Privat------------------");
        //hint: wir haben den getter und den ...
        privSal.setSalary(500);
        System.out.println("Sie/Er verdient " + privSal.getSalary());
        privSal.setSalary(-5000);
        System.out.println("Sie/Er verdient " + privSal.getSalary());
    }
}
