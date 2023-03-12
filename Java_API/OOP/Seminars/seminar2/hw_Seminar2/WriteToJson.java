package OOP.Seminars.seminar2.hw_Seminar2;

import java.io.FileWriter;
import java.util.Map;

public class WriteToJson extends AbstractClass {

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public static void write(Map<String, Float> students) {

        StringBuilder stringBuilder = new StringBuilder();

        try (FileWriter writer = new FileWriter("OOP/Seminars/seminar2/hw_Seminar2/convertFiles/students.json", true)) {
            writer.append("{\n");
            int counter = 0;
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ",\n");
                counter++;
                if (counter == students.size()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 2);
                }
                writer.append(stringBuilder);
            }
            writer.append('}');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
