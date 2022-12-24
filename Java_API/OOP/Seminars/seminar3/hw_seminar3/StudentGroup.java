package OOP.Seminars.seminar3.hw_seminar3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup implements Iterable<Student> {

    static List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        StudentGroup.studentList = studentList;
    }

    public int studentCount() {
        return studentList.size(); /* метод, возвращает размер коллекции */

    }

    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this); /* метод iterator, возвращает объект типа StudentGroupIterator, который содержит методы для обхода коллекции в прямой последовательности */
    }

    public ListIterator<Student> listIterator(int index) {
        return new GroupListIterator(this, index);
    } /* метод listIterator, возвращает объект типа GroupListIterator, который содержит методы для обхода коллекции в прямой и обратной последовательности */

    public Iterator<Student> reverseIterator() {
        return new ReverseIterator(this); /* метод reverseIterator, возвращает объект типа ReverseIterator который содержит методы для обхода коллекции в обратной последовательности */
    }
}
