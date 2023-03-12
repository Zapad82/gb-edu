package OOP.Seminars.seminar7.task1.ui;

import OOP.Seminars.seminar7.task1.model.User;
import OOP.Seminars.seminar7.task1.service.DataService;

public abstract class UserView<U extends User> {
    private DataService<U> model;

    public UserView(DataService<U> model) {
        this.model = model;
    }

    public void showUsers() {
        for (U user : model.getUsers()) {
            System.out.println(user);
        }
    }
}
