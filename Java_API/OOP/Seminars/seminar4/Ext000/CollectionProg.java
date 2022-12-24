package OOP.Seminars.seminar4.Ext000;

import java.util.*;

public class CollectionProg {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6 };
        MyCollection<Integer> myArray = new MyCollection<>(arr);
        myArray.setElement(2, 200);
        System.out.println(myArray);
        myArray.addNewElement(300);
        System.out.println(myArray);
    }
}

// <T> Iterable<T> filter (Iterable<T> array, IsGood<T> isGood) подсказка к
// домашке