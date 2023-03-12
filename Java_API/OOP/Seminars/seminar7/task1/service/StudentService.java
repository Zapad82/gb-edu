package OOP.Seminars.seminar7.task1.service;

import java.util.ArrayList;
import java.util.List;

import OOP.Seminars.seminar7.task1.model.Student;
import OOP.Seminars.seminar7.task1.util.DataReader;
import OOP.Seminars.seminar7.task1.util.DataWriter;

public class StudentService implements DataService<Student> {

    private final String path = "OOP/Seminars/seminar7/task1/db/studentDB.txt";

    private List<Student> students = new ArrayList<>();

    public List<Student> getUsers() {
        return new ArrayList<>(students);
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
    }

    @Override
    public void save() {
        DataWriter.dataWrite(students);
    }

    @Override
    public void load() {
        students = DataReader.dataRead(path);
    }
}
