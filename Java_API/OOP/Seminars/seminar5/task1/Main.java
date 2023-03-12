package task1;

import task1.model.Student;
import task1.util.DataReader;
import task1.util.DataWriter;

import java.util.ArrayList;
import java.util.List;

/*
Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. Student и Teacher добавляют поля, специфичные для этих классов. Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла
 */

/*
 * Создайте класс StudentView, который позволяет распечатать студентов из объекта StudentService.
 * 
Какие архитектурные изменения стоит внести, если вы подозреваете, 
что в будущем предстоит добавить аналогичный класс TeacherView?
 */
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", "Ivanov", 19, 3, 4.6f);
        Student st2 = new Student("Denis", "Popov", 22, 1, 4.1f);
        Student st3 = new Student("Ivan", "Smirnov", 23, 4, 4.3f);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        DataWriter.dataWrite(studentList);
        List<Student> studentList1 = DataReader.dataRead("OOP/Seminars/seminar5/task1/studentDB.txt");
        for (Student student : studentList1) {
            System.out.println(student);
        }
    }
}

/*
 * interface View<U extends User> { void print (DataService<U> students); }
 * class StudentView implements View<Student> { }
 * class TeacherView implements View<Teacher> { }
 */
