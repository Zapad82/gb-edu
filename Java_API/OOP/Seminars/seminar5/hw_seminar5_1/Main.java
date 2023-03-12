package hw_seminar5_1;

import java.time.LocalDate;
import java.util.Date;

import hw_seminar5_1.controller.AttendanceController;
import hw_seminar5_1.service.AttendanceService;
import hw_seminar5_1.view.AttendanceView;

/*
 * Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.

Есть группа студентов. Для каждого студента есть журнал его посещаемости: 
список дат занятий и для каждой даты — посетил студент занятие или нет. 
Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах.

Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.

Создайте класс контроллера со следующими функциями:
• Распечатать всех студентов и посещаемость каждого в процентах
• Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
• Распечатать студентов с посещаемостью ниже 25%

Проверьте, как это работает.
 */

public class Main {

    public static void main(String[] args) {
        // Создаём сервис посещаемости студентов AttendanceService
        AttendanceService attendanceService = new AttendanceService();

        // Задаём данные посещаемости студентов по датам с отметкой о посещении
        attendanceService.addAttendanceRecord("Иванов И.И.", LocalDate.of(2019, 5, 1), true);
        attendanceService.addAttendanceRecord("Иванов И.И.", LocalDate.of(2019, 5, 2), true);
        attendanceService.addAttendanceRecord("Иванов И.И.", LocalDate.of(2019, 5, 3), false);
        attendanceService.addAttendanceRecord("Иванов И.И.", LocalDate.of(2019, 5, 4), true);
        attendanceService.addAttendanceRecord("Иванов И.И.", LocalDate.of(2019, 5, 5), true);
        attendanceService.addAttendanceRecord("Максимова А.А.", LocalDate.of(2019, 5, 1), true);
        attendanceService.addAttendanceRecord("Максимова А.А.", LocalDate.of(2019, 5, 2), false);
        attendanceService.addAttendanceRecord("Максимова А.А.", LocalDate.of(2019, 5, 3), true);
        attendanceService.addAttendanceRecord("Максимова А.А.", LocalDate.of(2019, 5, 4), false);
        attendanceService.addAttendanceRecord("Максимова А.А.", LocalDate.of(2019, 5, 5), false);
        attendanceService.addAttendanceRecord("Егорова И.Ю.", LocalDate.of(2019, 5, 1), false);
        attendanceService.addAttendanceRecord("Егорова И.Ю.", LocalDate.of(2019, 5, 2), false);
        attendanceService.addAttendanceRecord("Егорова И.Ю.", LocalDate.of(2019, 5, 3), true);
        attendanceService.addAttendanceRecord("Егорова И.Ю.", LocalDate.of(2019, 5, 4), false);
        attendanceService.addAttendanceRecord("Егорова И.Ю.", LocalDate.of(2019, 5, 5), false);

        // Создаём представление
        AttendanceView attendanceView = new AttendanceView(attendanceService);

        // Создаём контроллер
        AttendanceController attendanceController = new AttendanceController(attendanceService, attendanceView);

        // Выводим всех студентов
        System.out.println("******************************");
        System.out.println("Журнал посещаемости студентов:");
        System.out.println("******************************");
        attendanceController.printAllAttendance();

        // Выводим отсортированных студентов
        System.out.println("**********************************************");
        System.out.println("Отсортированный журнал посещаемости студентов:");
        System.out.println("**********************************************");
        attendanceController.printSortedAttendance();

        // Выводим студентов с посещением меньше 25%
        System.out.println("***********************************");
        System.out.println("Студенты с посещаемостью менее 25%:");
        System.out.println("***********************************");
        attendanceController.printLowAttendance();
    }
}
