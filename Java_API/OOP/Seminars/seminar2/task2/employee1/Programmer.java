package OOP.Seminars.seminar2.task2.employee1;

public class Programmer extends Employee {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }

    @Override
    public int getSalary() {
        return 500;
    }

    @Override
    public String getAction() {
        return "Think as write code";
    }
}
