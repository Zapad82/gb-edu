package PO_Architecture.Seminar3.hw3.task1;

public class SalaryCalculator {
    private int baseSalary;

    public SalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in other way
        return baseSalary - tax;
    }
}