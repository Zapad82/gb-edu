package OOP.Seminars.seminar7.task1.ui;

import OOP.Seminars.seminar7.task1.model.Teacher;
import OOP.Seminars.seminar7.task1.service.DataService;

public class TeacherView extends UserView<Teacher> {

    public TeacherView(DataService<Teacher> model) {
        super(model);
    }
}
