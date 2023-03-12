// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package hw_seminar6;

import java.util.*;

public class NotebookStore {

    public static void main(String[] args) {
        HashSet<Notebook> notebook = new HashSet<>();
        notebook.add(new Notebook("Dell", 8, 256, "Windows", "Core I3", "Black", 325.99f));
        notebook.add(new Notebook("Sony Vaio", 16, 256, "Windows", "Core I5", "Silver", 500.99f));
        notebook.add(new Notebook("Asus", 16, 1024, "Windows", "Core I9", "Black", 775.99f));
        notebook.add(new Notebook("Apple", 8, 256, "MacOs", "Intel", "White", 620f));
        notebook.add(new Notebook("Dell", 8, 256, "Linux", "Core I3", "Black", 325.99f));
        notebook.add(new Notebook("Asus", 8, 256, "Windows", "Core I5", "Black", 400.99f));
        notebook.add(new Notebook("Samsung", 8, 256, "Windows", "Core I5", "Silver", 465.99f));

        System.out.println(Notebook.filterNotebooks(Notebook.filter(), notebook).toString());

        // HashSet<Notebook> array1 = (Notebook.filterNotebooks(Notebook.filter(),
        // notebook));
        // System.out.println(Arrays.toString(array1));

        // System.out.println(Laptop.filterLaptops(Laptop.filter(), laptopList));;

    }
}