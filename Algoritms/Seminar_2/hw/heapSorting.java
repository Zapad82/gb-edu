import java.util.Random;

public class heapSorting {

    private static final Random random = new Random();

    public static void main(String[] args) {
        // создаём массив с использованием метода ArrayUtils
        int[] arr = ArrayUtils.prepareArray();
        // выводим массив в консоль
        System.out.println();
        System.out.println("Задан массив из случайных чисел:");
        ArrayUtils.printArray(arr);
        System.out.println();

        // сортируем массив

    }

    // заполняем массив случайными числами от -50 до 50
    static class ArrayUtils {

        private static int[] prepareArray() {
            int[] arr = new int[random.nextInt(16) + 5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(101) - 50;
            }
            return arr;
        }

        static void printArray(int[] arr) {
            for (int e : arr) {
                System.out.printf("%d\t", e);
            }
            System.out.println();
        }

    }

    // метод сортировки пирамидой (бинарной кучей)
    private static void Sort(int[] arr) {

        // задаем переменную, которая будет равна длинне массива
        int n = arr.length;
    }
}