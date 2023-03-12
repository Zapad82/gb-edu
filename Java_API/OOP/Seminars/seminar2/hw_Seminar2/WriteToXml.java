package OOP.Seminars.seminar2.hw_Seminar2;

import java.io.FileWriter;
import java.util.Map;

public class WriteToXml extends AbstractClass {

    @Override
    public void read() {

    }

    @Override
    public void write() {

    }

    public static void write(Map<String, Float> students) {

        StringBuilder stringBuilder = new StringBuilder();

        try (FileWriter writer = new FileWriter("OOP/Seminars/seminar2/hw_Seminar2/convertFiles/students.xml", true)) {
            writer.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
            writer.append("<students>\n");

            for (Map.Entry<String, Float> entry : students.entrySet()) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append("\t<student>\n" + "\t\t<name>" + entry.getKey() + "</name>\n" + "\t\t<grade>"
                        + entry.getValue() + "</grade>\n" + "\t</student>\n");
                writer.append(stringBuilder);
            }

            writer.append("</students>");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
