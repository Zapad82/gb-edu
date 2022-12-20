// Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).

// Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:

// Просто текст:

// Иван Иванов=4.8
// Мария Кузнецова=5.0
// Степан Кузьмин=3.6

// JSON:

// {
// "Иван Иванов": 4.8,
// "Мария Кузнецова": 5.0,
// "Степан Кузьмин": 3.6
// }

// XML:

// <?xml version="1.0" encoding="utf-8" ?>
// <students>
// <student>
// <name>Иван Иванов</name>
// <grade>4.8</grade>
// </student>
// <student>
// <name>Мария Кузнецова</name>
// <grade>5.0</grade>
// </student>
// <student>
// <name>Степан Кузьмин</name>
// <grade>3.6</grade>
// </student>
// </students>

package OOP.Seminars.seminar2.hw_Seminar2;

import java.io.*;
import java.util.*;

import org.w3c.dom.Text;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        // формируем список объектов Student
        Map<Integer, TxtWriter<String, Float>> students = new HashMap<Integer, new TxtWriter<String, Float>>();
        students.put(1, new Student("Андрей Рязанцев", 2.5f));
        students.addStudent(2, new Student("Виктор Губин", 3.4f));
        students.addStudent(new Student("Елена Прекрасная", 5.0f));
        students.addStudent(new Student("Алена Кондакова", 4.7f));
        students.addStudent(new Student("Иван Иванов", 3.7f));
        students.addStudent(new Student("Екатерина Токарева", 4.4f));
        students.addStudent(new Student("Елена Петрова", 5.0f));
        students.addStudent(new Student("Татьяна Пакова", 4.3f));

        // System.out.println(students.toString());
        File file = new File(
                "OOP/Seminars/seminar2/hw_Seminar2/convertFiles/students.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(students.toString());
        pw.close();
    }

}
