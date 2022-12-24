package OOP.Seminars.seminar3.hw_seminar3;

public class ReverseIterator extends StudentGroupIterator {

    public ReverseIterator(StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.studentCount() - 1; // начало с последней позиции
    }

    public boolean hasNext() {
        return index > -1; // метод проверяет существование элемента в коллекции index > -
    }

    public Student next() {
        return Student.nextStudent(index--); // next возвращает элемент, использует оператор --, чтобы проходить по
                                             // коллекции в обратном порядке
    }

}
