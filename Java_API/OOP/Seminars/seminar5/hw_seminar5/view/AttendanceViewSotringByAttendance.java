package hw_seminar5.view;

import java.util.Collections;
import java.util.List;

import hw_seminar5.model.Student;
import hw_seminar5.service.AttendanceService;

/*
класс сортирует студентов по убыванию.
порядок сортировки задается методом compareTo() в классе Student
 */
public class AttendanceViewSotringByAttendance extends AttendanceView {
    private final List<Student> studentList = new AttendanceService().getStudentList();

    /*
     * метод выводит информацию о студентах в консоль
     */
    @Override
    public void showInfo() {
        System.out.println("***********************************");
        System.out.println("Выбрана сортировка списка студентов по посещаемости");
        System.out.println("***********************************");
        Collections.sort(studentList); // сортируем студентов
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
