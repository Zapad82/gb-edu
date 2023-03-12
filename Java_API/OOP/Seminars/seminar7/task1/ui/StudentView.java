package OOP.Seminars.seminar7.task1.ui;

import OOP.Seminars.seminar7.task1.model.Student;
import OOP.Seminars.seminar7.task1.service.DataService;

public class StudentView extends UserView<Student> {

    public StudentView(DataService<Student> model) {
        super(model);
    }
}
