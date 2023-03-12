package OOP.Seminars.seminar2.task2.employee1;

import java.util.List;

public class Company {

    private List<Employee> employeeList;

    public Company(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void goWork() {
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
            System.out.println(employee.getAction());
        }
    }
}
