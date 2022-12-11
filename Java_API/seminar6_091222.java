import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class seminar6_091222 {
    public static void main(String[] args) { 
        System.out.println(new HashSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3))); 
        System.out.println(new TreeSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3))); 
        System.out.println(new LinkedHashSet<> (Arrays.asList (6, 5, 1, 2, 3, 2, 4, 6, 5, 3))); 
    }
}


// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
class RandomMassive {
    public static void main(String[] args) {
            Integer[] array = fillingArrayRandomNumbers(1000, 0, 25);
            printArray(array);
            System.out.println(getPercentageOfUniqueNumbers(array));
        }
        
        // заполнение массива рандомно в заданном диапозоне
    static Integer[] fillingArrayRandomNumbers(int length, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[length];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(max - min) + min;
        }
        return array;
    }
        
        // вывод на консоль одномерного массива
    static void printArray(Integer[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
        
        static float getPercentageOfUniqueNumbers (Integer [] array){
            TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(array));
            return treeSet.size() * 100.0f / array.length;
        } 
}



// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.
class Task2 {
    public static void main(String[] args) {
        seminar6_cat cat = new Cat ("Барсик", "Иван Иванович", "??", 40f);

        System.out.println(cat.getName ());
        cat.setName ("Мурчик");
    }
}



