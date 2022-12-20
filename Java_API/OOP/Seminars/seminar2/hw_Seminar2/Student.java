package OOP.Seminars.seminar2.hw_Seminar2;

public abstract class Student {
    private static String nameForname; // имя и фамилия студента
    private static Float averageScore; // средний балл

    public Student(String nameForname, Float averageScore) {
        Student.nameForname = nameForname;
        Student.averageScore = averageScore;
    }

    public static String getNameForname() {
        return nameForname;
    }

    public static Float getAverageScore() {
        return averageScore;
    }

}
