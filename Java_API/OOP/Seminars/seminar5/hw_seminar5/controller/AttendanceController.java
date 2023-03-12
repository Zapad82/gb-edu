package hw_seminar5.controller;

import java.util.Scanner;

import hw_seminar5.view.AttendanceView;
import hw_seminar5.view.AttendanceViewAllStudents;
import hw_seminar5.view.AttendanceViewSotringByAttendance;
import hw_seminar5.view.AttendanceViewSortingByAttendanceLessThan25Percent;

public class AttendanceController {
    private AttendanceView[] attendanceViews = new AttendanceView[3];

    /*
     * добавляем в массив AttendanceView классы его наследники
     */
    public AttendanceController() {
        attendanceViews[0] = new AttendanceViewAllStudents();
        attendanceViews[1] = new AttendanceViewSotringByAttendance();
        attendanceViews[2] = new AttendanceViewSortingByAttendanceLessThan25Percent();
    }

    /*
     * метод, запускает приложение, выводит меню выбора действий в консоли.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите какое действие нужно выполнить (Введите число от 1 до 3): " +
                    "\n1. Вывести всех студентов." +
                    "\n2. Отсортировать всех студентов по посещаемости." +
                    "\n3. Отсортировать всех студентов, у кого посещаемость меньше 25%" +
                    "\n0. Выход из программы" +
                    "\n>>> ");
            int i;
            try {
                i = scanner.nextInt(); // запрос ввода пользователя
                if (i == 0) { // проверка ввода нуля(запрос выхода из программы)
                    System.out.println("Выход из программы.");
                    return;
                }

                attendanceViews[i - 1].showInfo(); // вызов метода showInfo() класса, которые находится в массиве по
                                                   // заданному индексу

            } catch (Exception ex) {
                System.out.println("Некорректное значение, повторите ввод. Число должно быть от 1 до 3.");
                System.out.println("***********************************");
            }
        }
    }
}
