package OOP.Seminars.seminar2.task2.employee;

import java.util.ArrayList;
import java.util.List;

public class MainFirm {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new DesignerEmployee());
        employees.add(new ProgrammerEmployee());
        // for (Employee employee : employees){
        // employee.work();
        // }
        BossEmployee boss = new BossEmployee(employees);
        boss.work();

    }
}
