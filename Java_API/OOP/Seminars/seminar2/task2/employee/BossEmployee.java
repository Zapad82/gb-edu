package OOP.Seminars.seminar2.task2.employee;

import java.util.ArrayList;
import java.util.List;

public class BossEmployee extends Employee {
    private List<Employee> employees = new ArrayList<>();

    public BossEmployee(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String getJobTitle() {

        return "Big Boss";
    }

    @Override
    public Integer getSalary() {

        return 1000000;
    }

    @Override
    public void work() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    @Override
    public String toString() {
        return "BossEmployee [employees=" + employees + "]";
    }

}
