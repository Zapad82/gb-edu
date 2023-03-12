import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

// 1. В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

public class hw_seminar2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("hw_seminar2_task1.json"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());

            }           
            System.out.println(sb);
            String words = sb.toString(); //.split("[{,}:\",]");
            // String charsToRemove = "{:,}";
            // String[] stringWords = words.split(":");
            words = words.replace(":", ",");
            words = words.replace("\"", "");
            words = words.replace("{", "");
            words = words.replace("}", "");
            List<String> myList = new ArrayList<String>(Arrays.asList(words.split(",")));

            String name1 = (myList.get(0) + " = " + "\"" + myList.get(1) + "\"");
            String country = (" AND " + myList.get(2) + " = " + "\"" + myList.get(3) + "\"");
            String city = (" AND " + myList.get(4) + " = " + "\"" + myList.get(5) + "\"");

            System.out.println("SELECT * FROM students WHERE " + name1 + country + city);

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
} // Другого решения для данной задачи я не придумал, к сожалению.


// 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
class bubbleSort {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {16, 3, 43, 21, 9, 9, 1, 66, 14, 1, 74, 52};
        Logger logger = Logger.getLogger(hw_seminar2.class.getName());
        FileHandler fh = new FileHandler("log_hw_seminnar2_task2.txt");
        logger.addHandler(fh);

        int temp;                                               // буфер
        for (int i = array.length - 1; i > 0; i--) {            
            for (int j = 0; j < i; j++) {                       
                if (array[j] > array[j + 1]) {                  
                    temp = array[j];                            
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp;
                }
            }
            logger.setLevel(Level.INFO);
            logger.info("Новая итерация"); // запись в лог
        }

        System.out.println(Arrays.toString(array));             //выводим результат на консоль
    }
}


// 3. В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
class task_3 {
    public static void main(String[] args) {
        String jsonString = read();
        for (String item : splittingArrayElements(jsonString)) {
            System.out.println(createString(createArrayStrings(item)));
        }

    }


    // функция чтения данных из файла
    private static String read() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./hw_seminar2_task3.txt"))) {
            String line;
            StringBuffer stringBuffer = new StringBuffer();
            
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }

            return stringBuffer.toString();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    // функция деления данных по запятой
    private static String[] splittingArrayElements(String jsonString) {
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        String[] arr = jsonString.split(", ");
        return arr;
    };

    private static String[][] createArrayStrings(String string) {
        string = string.substring(1, string.length() - 1);
        String[] arr = string.split("\"");
        string = String.join("", arr);
        arr = string.split(",");
        String[][] newArray = new String[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i].split(":");
        }

        return newArray;
    }

    // функция составления нового предложения из наших данных путем подмены значений в ячейках
    private static String createString(String[][] arrayStrings) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Студент ");
        for (String[] array : arrayStrings) {
            if (array[0].equals("фамилия")) {
                stringBuffer.append(array[1]);
                stringBuffer.append(" получил ");
            }
            if (array[0].equals("оценка")) {
                stringBuffer.append(array[1]);
                stringBuffer.append(" по предмету ");
            }
            if (array[0].equals("предмет")) {
                stringBuffer.append(array[1]);
            }

        }
        return stringBuffer.toString();
    }
}
// Решение этой задачи я попросил у коллег. Сам до такого не догадался. Я бы мог ее решить таким же способом,
// как и первую задачу, но хотел увидеть нормальное и правильное решение. 

