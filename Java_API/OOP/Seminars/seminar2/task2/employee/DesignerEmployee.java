package OOP.Seminars.seminar2.task2.employee;

public class DesignerEmployee extends Employee {

    @Override
    public String getJobTitle() {

        return "Designer";
    }

    @Override
    public Integer getSalary() {

        return 80000;
    }

    @Override
    public void work() {
        System.out.println("Designer is painting");

    }

    @Override
    public String toString() {
        return "DesignerEmployee []";
    }

}
