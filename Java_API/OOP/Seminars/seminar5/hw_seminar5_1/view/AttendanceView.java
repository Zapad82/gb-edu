package hw_seminar5_1.view;
/*
 * класс AttendanceView, позволяет отображать студентов и их посещаемость
 */
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import hw_seminar5_1.service.AttendanceService;

public class AttendanceView {
    private AttendanceService attendanceService;

    public AttendanceView(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    public void showAttendance() {
        Map<String, Map<LocalDate, Boolean>> attendanceRecords = attendanceService.getAttendanceRecords();

        for (String student : attendanceRecords.keySet()) {
            System.out.println(student + ":");
            Map<LocalDate, Boolean> studentAttendanceRecord = attendanceRecords.get(student);
            for (LocalDate date : studentAttendanceRecord.keySet()) {
                System.out.println("\t" + date + ": " + (studentAttendanceRecord.get(date) ? "+" : "-"));
            }
            System.out.println();
        }
    }
}
