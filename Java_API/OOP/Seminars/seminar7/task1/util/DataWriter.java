package OOP.Seminars.seminar7.task1.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import OOP.Seminars.seminar7.task1.model.User;

public class DataWriter {

    public static <U extends User> void dataWrite(List<U> list) {
        try (FileWriter writer = new FileWriter("OOP/Seminars/seminar7/task1/db/studentDB.txt", false)) {
            for (U user : list) {
                writer.write(user.toFileString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
