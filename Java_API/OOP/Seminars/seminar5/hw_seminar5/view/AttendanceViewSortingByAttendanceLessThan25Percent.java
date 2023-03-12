package hw_seminar5.view;

import java.util.List;

import hw_seminar5.model.Student;
import hw_seminar5.service.AttendanceService;

/*
класс выполняет сортировку студентов с посещаемостью меньше 25%
 */
public class AttendanceViewSortingByAttendanceLessThan25Percent extends AttendanceView {
    private final List<Student> studentList = new AttendanceService().getStudentList();

    /*
     * метод выводит информацию о студентах в консоль
     */
    @Override
    public void showInfo() {
        System.out.println("***********************************");
        System.out.println("Выбрана сортировка списка студентов у кого меньше 25% посещаемости");
        System.out.println("***********************************");
        for (Student student : studentList) {
            if (student.getAttendance().percentAttendance() < 25) {
                System.out.printf(
                        "Имя: %s, Фамилия: %s, Курс: %d\nДаты посещения занятий:\n%s\nПроцент посещения: %d\n=======================\n",
                        student.getName(),
                        student.getSurname(),
                        student.getCourse(),
                        student.getAttendance(),
                        student.getAttendance().percentAttendance());
            }
        }
        System.out.println("***********************************");
    }
}
