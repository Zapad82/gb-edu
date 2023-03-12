package OOP.Seminars.seminar3.hw_seminar3;

import java.util.Iterator;
// класс имплементирует интерфейс Iterator, переопределяя его методы

public class StudentGroupIterator implements Iterator<Student> {

    int index = 0;
    private StudentGroup studentGroup;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.studentCount(); // // пока index меньше размера коллекции из studentGroup
    }

    @Override
    public Student next() {
        return Student.nextStudent(index++); // возвращается элемент и увеличивается значение index
    }
}
