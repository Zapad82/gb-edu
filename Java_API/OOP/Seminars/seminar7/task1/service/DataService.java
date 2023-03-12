package OOP.Seminars.seminar7.task1.service;

import java.util.List;

import OOP.Seminars.seminar7.task1.model.User;

public interface DataService<U extends User> {

    void addUser(U user);

    void save();

    void load();

    List<U> getUsers();
}
