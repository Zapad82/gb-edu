package OOP.Seminars.seminar2.hw_Seminar2;

import java.io.FileWriter;
import java.util.Map;

public class WriteToTxt extends AbstractClass {
    @Override
    public void read() {

    }

    public static void write(Map<String, Float> students) {
        try (FileWriter writer = new FileWriter("OOP/Seminars/seminar2/hw_Seminar2/convertFiles/students.txt", true)) {
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                writer.append(entry.toString());
                writer.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void write() {
        // TODO Auto-generated method stub

    }

}
