package hw_seminar5_1.service;
/*
 * класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах.
 */
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AttendanceService {
    private Map<String, Map<LocalDate, Boolean>> attendanceRecords;

    public AttendanceService() {
        attendanceRecords = new HashMap<>();
    }

    public void addAttendanceRecord(String studentName, LocalDate date, boolean attended) {
        if (!attendanceRecords.containsKey(studentName)) {
            attendanceRecords.put(studentName, new HashMap<>());
        }

        Map<LocalDate, Boolean> studentAttendanceRecord = attendanceRecords.get(studentName);
        studentAttendanceRecord.put(date, attended);
    }

    public Map<String, Map<LocalDate, Boolean>> getAttendanceRecords() {
        return attendanceRecords;
    }
}
