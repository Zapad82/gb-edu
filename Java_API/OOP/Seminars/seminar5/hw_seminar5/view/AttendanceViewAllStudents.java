package hw_seminar5.view;

import java.util.List;

import hw_seminar5.model.Student;
import hw_seminar5.service.AttendanceService;

/*
класс показывает всю информацию о студентах и из посещаемости
 */
public class AttendanceViewAllStudents extends AttendanceView {
    private final List<Student> studentList = new AttendanceService().getStudentList();

    /*
     * метод выводит информацию о студентах в консоль
     */
    @Override
    public void showInfo() {
        System.out.println("***********************************");
        System.out.println("Выбран вывод всего списка студентов");
        System.out.println("***********************************");
        for (Student student : studentList) {
            System.out.printf(
                    "Имя: %s, Фамилия: %s, Курс: %d\nДаты посещения занятий:\n%s\nПроцент посещения: %d\n=======================\n",
                    student.getName(),
                    student.getSurname(),
                    student.getCourse(),
                    student.getAttendance(),
                    student.getAttendance().percentAttendance());
        }
        System.out.println("***********************************");

    }

}
