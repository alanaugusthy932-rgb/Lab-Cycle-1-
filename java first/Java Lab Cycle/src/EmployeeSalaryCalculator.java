import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input basic salary
        System.out.print("Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate DA and HRA
        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;

        // Calculate Gross Salary
        double grossSalary = basicSalary + da + hra;

        // Display output
        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        sc.close();
    }
}