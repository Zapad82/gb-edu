package OOP.Seminars.seminar2.task2;

import OOP.Seminars.seminar2.task2.employee1.Company;
import OOP.Seminars.seminar2.task2.employee1.Designer;
import OOP.Seminars.seminar2.task2.employee1.Employee;
import OOP.Seminars.seminar2.task2.employee1.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Programmer("Denis"));
        list.add(new Programmer("Alexey"));
        list.add(new Designer("Anton"));
        list.add(new Designer("Masha"));

        Company company = new Company(list);
        company.goWork();
    }
}
