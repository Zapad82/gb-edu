package ExceptionsAndErrors.Seminar_1.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

// 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”.

// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
// необходимо как-то оповестить пользователя.

// 3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив. 
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, 
// детализировать какие строки со столбцами не требуется.

public class Main {
    public static void main(String[] args) {
        // ************************************
        System.out.println();
        System.out.println("Решение задачи № 1:");

        Integer[] arr1 = { 1, 2, 3 };
        boolean result1 = checkArray(arr1); // true
        System.out.println(result1 + ": значения не равны null");

        Integer[] arr2 = { null, 2, 3 };
        boolean result2 = checkArray(arr2); // false
        System.out.println(result2 + ": присутствует значение null");

        System.out.println();
        System.out.println("Оповещение о null-ах:");
        // Arrays arrayUtils = new ArrayUtils();
        boolean result3 = containsNull(arr1); // true
        System.out.println(result3 + ": null-ы не найдены");
        boolean result4 = containsNull(arr2); // false
        System.out.println();
        // ****************************************************

        System.out.println("Решение задачи № 2:");
        int[] array1 = { 1, 2, 3 };
        System.out.println("Массив 1: " + Arrays.toString(array1));

        int[] array2 = { 4, 5, 6 };
        System.out.println("Массив 2: " + Arrays.toString(array2));

        int[] result = sumArrays(array1, array2);
        System.out.println("Сумма массивов равна: " + Arrays.toString(result)); // [5, 7, 9]
        System.out.println();
        // когда длина массивов не совпадает
        int[] array3 = { 1, 2, 3 };
        System.out.println("Массив 1: " + Arrays.toString(array3));

        int[] array4 = { 4, 5, 6, // 4
        };
        System.out.println("Массив 2: " + Arrays.toString(array4));
        int[] result5 = sumArrays(array3, array4);
        System.out.println(result5);
        System.out.println();
        // ******************************************************* */

        System.out.println("Решение задачи со звездочкой:");
        int[] one = { 1, 2, 3 };
        int[] two = { 4, 5, 6 };
        int[] thre = { 7, 8, 9 };
        int[][] matrix1 = { one, two, thre };
        System.out.println("Дан двумерный массив 1: [" + Arrays.toString(one) + ", " + Arrays.toString(two) + ", "
                + Arrays.toString(thre) + "]");
        checkSquareMatrix(matrix1);
        System.out.println(); // выведет "Двумерный массив является квадратной матрицей"
        System.out.println(matrix1);

        int[] four = { 1, 2, 3 };
        int[] five = { 4, 5 };
        int[] six = { 7, 8, 9 };
        int[][] matrix2 = { four, five, six };

        System.out.println("Дан двумерный массив 2: [" + Arrays.toString(four) + ", " + Arrays.toString(five) + ", "
                + Arrays.toString(six) + "]");
        checkSquareMatrix(matrix2); // выведет "Строка 1 имеет длину 2, отличную от длины 3 других строк"
        System.out.println();
    }

    // Если в массиве встретится хотя бы один null элемент, метод должен вернуть
    // false.
    // Если все элементы массива не равны null, метод должен вернуть true.
    public static boolean checkArray(Integer[] arr) {
        for (Integer integer : arr) {
            if (integer == null) {
                return false;
            }
        }
        return true;
    }

    // оповещение о null-ах
    public static boolean containsNull(Integer[] arr1) {
        boolean containsNull = false;
        List<Integer> nullIndices = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null) {
                containsNull = true;
                nullIndices.add(i);
            }
        }

        if (containsNull) {
            System.out.println(
                    "false: Нулевое значение (значения) найденно в индексе (индексах): " + nullIndices);
        }

        return !containsNull;
    }

    // решение задачи №2
    public static int[] sumArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Один из входных массивов не существует");
        }
        int length1 = arr1.length;
        int length2 = arr2.length;
        if (length1 != length2) {
            throw new IllegalArgumentException("Длины входных массивов не совпадают");
        }
        int[] result = new int[length1];
        for (int i = 0; i < length1; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }

    // задача со звездочкой
    public static void checkSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != columns) {
                System.out.printf("Строка %d имеет длину %d, отличную от длины %d других строк%n", i, matrix[i].length,
                        columns);
                return;
            }
        }
        System.out.println("Данный двумерный массив является квадратной матрицей");
    }
}
