package Algoritms.Seminar_2.hw;

import java.util.Arrays;
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
        BinaryHeapSort.sort(arr);
        // выводим отсортированный массив в консоль
        System.out.println("Массив отсортирован методом бинарной кучи:");
        ArrayUtils.printArray(arr);
        // System.out.println(Arrays.toString(arr));

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
    public static class BinaryHeapSort {
        private static void sort(int[] arr) {
            // задаем переменную, которая будет равна длинне массива
            int n = arr.length;

            // Собираем в кучу несортированный массив
            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);

            // Извлекаем элементы из кучи один за другим
            for (int i = n - 1; i >= 0; i--) {
                // Перемещаем текущий root в конец
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Вызоваем max heapify для уменьшенной кучи
                heapify(arr, i, 0);
            }
        }

        private static void heapify(int[] arr, int n, int i) {
            int largest = i; // Инициализируем самый большой элемент как корневой элемент
            int l = 2 * i + 1; // Дочерний элемент слева от корневого
            int r = 2 * i + 2; // Дочерний элемент справа корневого

            // Если левый дочерний элемент больше корневого
            if (l < n && arr[l] > arr[largest])
                largest = l;

            // Если правый дочерний элемент больше, чем самый большой на данный момент
            if (r < n && arr[r] > arr[largest])
                largest = r;

            // Если самый большой элемент не является корневым
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Рекурсивно вызываем heapify относительно поддерева
                heapify(arr, n, largest);
            }
        }
    }
}
