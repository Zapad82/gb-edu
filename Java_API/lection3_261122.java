import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class lection3_261122 {
    
    //  Тип данных Object - "всему голова"
    // Упаковка - любой тип можно положить в переменную типа Objact
    // Распаковка - преобразование Obect-переменной в нужный тип
    // Иерархия типов - любой тип "ниже" Object'а




    // Иерархия коллекций. List
    // List - пронумерованный набор элементов.
    // Пользователь этого интерфейса имеет точный контроль над тем, где в списке вставляется каждый элемент.
    // Пользователь может обращаться к элементам по их целочисленному индексу (позиции в списке) и искать элементы в списке.

    // URL

    // ArrayList, LinkedList (Vector, Stack - устаревшие)



    // Коллекции. Функционал

    // add(args) - добавляет элемент в список (в т.ч. на нужную позицию)
    // get(pos) - возвращает элемент из списка по указанной поzиции
    // indexOf(item) - первое вхождение или -1
    // lastIndexOf(item) - последнее вхождение или -1
    // remove(pos) - удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) - помещает значение item элементу, который находится на позиции pos
    // void sort(Comparator) - сортирует набор данных по правилу
    // subList(int start, int end) - получение набора данных от позиции start до end
    // clear() - очистка списка
    // toString() - "конвертация" списка в строку
    // Array.asList - преобразует массив в список
    // containsAll(col) - проверяет включение всех элементов из col
    // removeAll(col) - удаляет элементы, имеющиеся в col
    // retainAll(col) - оставляет элементы, имеющиеся в col
    // toArray() конвертация списка в массив Object'ов
    // toArray(type array) - конвертация списка в массив type
    // List.copyOf(col) - возвращает копию списка на основе имеющегося
    // List.of(item1,item2,...) - возвращает неизменяемый список


    // Итератор

    // Получение итератора с целью более гибкой работы с данными URL
    // Интерфейс Iterator<E>. Итератор коллекций. Iterator занимает место Enumeration в Java Collections Framework. Итераторы отличаются от перечислений двумя способами:
    // Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации с четко определенной семантикой.
    // hasNext(), next(), remove()
    // ListIterator<E> URL
    // hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)



    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;
            
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItemInArray(a, 11);
        a = AddItemInArray(a, 111);
        a = AddItemInArray(a, 1111);
        System.out.println();
        for (int j : a) { System.out.printf("%d ", j); }
        System.out.println();        
    }
}

class Ex002 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();
        list.add(2809);
 
 
        for (Object o : list) {
            System.out.println(o);
        }
    }
}


class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        list3.add(123);
        System.out.println(list4);

    }
}



class Ex004 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
    }
}


class Ex005 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [29, 9, 1990]
        day = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
    }
}


class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        
    }
}


class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }

    }
}