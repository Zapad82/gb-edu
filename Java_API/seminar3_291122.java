import java.security.Provider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import classes.IntegerComparator;

// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});



public class seminar3_291122 {
    public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1 == s4);
    System.out.println(s1 == s5);
    System.out.println(s1 == s6);
    System.out.println(s1.equals(s5));
    System.out.println(s1.equalsIgnoreCase(s5));

    }
}


// Задание 1
// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
class randomDec {
    public static void main(String[] args) {
        IntegerComparator ic = new IntegerComparator(); // для решения с компоратором
        ArrayList<Integer> my_list = new ArrayList<>();
        Random rand = new Random();

        for (int i=0; i<10; i++) {
            int temp = rand.nextInt(100);
            my_list.add(temp);
        }


        my_list.sort(ic);
        System.out.println(my_list);
        // System.out.println(my_list); // для решения без компоратора
        // my_list.sort(null);
        // System.out.println(my_list);
    }
}

// Задание 2.1
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
class task2_1 {
    public static void main(String[] args) {
        ArrayList<String> my_list = new ArrayList<String>();
        my_list.add("Земля");
        my_list.add("Венера");
        my_list.add("Марс");
        my_list.add("Плутон");
        my_list.add("Меркурий");
        my_list.add("Сатурн");

        Random rand = new Random();
        ArrayList<String> final_list = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            int index = rand.nextInt(my_list.size());
            String planet = my_list.get(index);
            final_list.add(planet);
        }
        System.out.println(final_list);

        final_list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        int count = 1;
        for (int i = 0; i < final_list.size()-1; i++) {
            String str = final_list.get(i);
            if (final_list.get(i).equals(final_list.get(i+1))) {
                count++;
            } else {
                System.out.println(str + " " + count);
                count = 1;
            }
        }
        System.out.println(final_list.get(final_list.size() - 1) + " " + count);
        // Задание 2.2
        // Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        for (int i = 1; i < final_list.size(); i++) {
            if(final_list.get(i).equals(final_list.get(i-1))) {
                final_list.remove(i);
                i--;
            }
        }
        System.out.println(final_list);
    }
}




// Задание 3
// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
class task3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String> (); 
        list.add ("fhdjsfsd"); // 
        // String list.add (12312312); // 
        // Integer list.add ("fhdjsfsd"); 
        list.add (12312312); 
        list.add ("fhdjsfsd"); 
        list.add (12312312); 
        list.add ("fhdjsfsd"); 
        list.add (12312312); 
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }
}




// Задание 4
// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.
class Task4{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());
        list.add(new ArrayList<String>());


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) { //
            System.out.println("Пожалуйста введите жанр ");
            list.get(i).add(sc.nextLine());
            // list.get(i).get(j)

            for (int j = 0; j < 5; j++) {
                System.out.println("Пожалуйста введите название книги ");
                list.get(i).add(sc.nextLine());
            }
            
        }
        sc.close();
        System.out.println(list);
    }
    
}


