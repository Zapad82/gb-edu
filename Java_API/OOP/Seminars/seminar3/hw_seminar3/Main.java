package OOP.Seminars.seminar3.hw_seminar3;
// Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

// Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. Он реализует интерфейс ListIterator<Student>.

// Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

// Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
// • Он отслеживает текущую позицию в переборе
// • Он изначально выставлен на конечную позицию
// • Он движется справа налево
// Проверьте, как он работает.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>(Arrays.asList(new Student("Denis", LocalDate.now(), 4.5f),
                new Student("Masha", LocalDate.now(), 4.1f),
                new Student("Anna", LocalDate.now(), 3.6f),
                new Student("Petr", LocalDate.now(), 4.9f)));

        StudentGroup studentGroup = new StudentGroup(list);

        System.out.println("\nStudent Group Iterator: ");
        Iterator<Student> iter = studentGroup.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\nStudent Group List Iterator: ");
        Iterator<Student> listIterPrevious = studentGroup.listIterator(3);
        while (((ListIterator<Student>) listIterPrevious).hasPrevious()) {
            System.out.println(((ListIterator<Student>) listIterPrevious).previous());
        }
        Iterator<Student> listIterNext = studentGroup.listIterator(1);
        while (((ListIterator<Student>) listIterNext).hasNext()) {
            System.out.println(((ListIterator<Student>) listIterNext).next());
        }

        System.out.println("\nStudent Group Reverse Iterator: ");
        Iterator<Student> reverseIter = studentGroup.reverseIterator();
        while (reverseIter.hasNext()) {
            System.out.println(reverseIter.next());
        }
    }
}
