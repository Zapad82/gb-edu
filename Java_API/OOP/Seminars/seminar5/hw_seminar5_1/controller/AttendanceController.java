package hw_seminar5_1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import hw_seminar5_1.service.AttendanceService;
import hw_seminar5_1.view.AttendanceView;

public class AttendanceController {
    private AttendanceService attendanceService;
    private AttendanceView attendanceView;

    public AttendanceController(AttendanceService attendanceService, AttendanceView attendanceView) {
        this.attendanceService = attendanceService;
        this.attendanceView = attendanceView;
    }

    public void printAllAttendance() {
        attendanceView.showAttendance();
    }

    public void printSortedAttendance() {
        Map<String, Map<LocalDate, Boolean>> attendanceRecords = attendanceService.getAttendanceRecords();

        // Сортировка по уровню посещаемости
        TreeMap<Double, List<String>> sortedAttendanceRecords = new TreeMap<>();
        for (String student : attendanceRecords.keySet()) {
            Map<LocalDate, Boolean> studentAttendanceRecord = attendanceRecords.get(student);

            double attendanceRate = 100.0 * (double) studentAttendanceRecord.values().stream().filter(a -> a).count()
                    / (double) studentAttendanceRecord.size();

            // Добавление студента к отсортированным данным
            if (!sortedAttendanceRecords.containsKey(attendanceRate)) {
                sortedAttendanceRecords.put(attendanceRate, new ArrayList<>());
            }
            sortedAttendanceRecords.get(attendanceRate).add(student);
        }

        // Отображение отсортированных данных
        for (double attendanceRate : sortedAttendanceRecords.descendingKeySet()) {
            System.out.println("Посещаемость: " + attendanceRate + "%");
            for (String student : sortedAttendanceRecords.get(attendanceRate)) {
                System.out.println("\t" + student);
            }
            System.out.println();
        }
    }

    public void printLowAttendance() {
        Map<String, Map<LocalDate, Boolean>> attendanceRecords = attendanceService.getAttendanceRecords();

        // Фильтр студентов с посещением более 25%
        List<String> lowAttendanceStudents = new ArrayList<>();
        for (String student : attendanceRecords.keySet()) {
            Map<LocalDate, Boolean> studentAttendanceRecord = attendanceRecords.get(student);

            double attendanceRate = 100.0 * (double) studentAttendanceRecord.values().stream().filter(a -> a).count()
                    / (double) studentAttendanceRecord.size();
            if (attendanceRate < 25.0) {
                lowAttendanceStudents.add(student);
            }
        }

        // Отображение результата студентов с посещаемостью менее 25%
        for (String student : lowAttendanceStudents) {
            System.out.println("\t" + student);
        }
    }
}
