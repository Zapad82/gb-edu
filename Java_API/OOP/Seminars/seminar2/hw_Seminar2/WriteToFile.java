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


public class WriteToFile {
    public static void main(String[] args) throws IOException {

        // формируем список объектов Student
        Map<String, Float> students = new HashMap<>();
        students.put("Андрей Рязанцев", 2.5f);
        students.put("Виктор Губин", 3.4f);
        students.put("Елена Прекрасная", 5.0f);
        students.put("Алена Кондакова", 4.7f);
        students.put("Иван Иванов", 3.7f);
        students.put("Екатерина Токарева", 4.4f);
        students.put("Елена Петрова", 5.0f);
        students.put("Татьяна Пакова", 4.3f);

        WriteToTxt.write(students);
        WriteToJson.write(students);
        WriteToXml.write(students);
    }

}
