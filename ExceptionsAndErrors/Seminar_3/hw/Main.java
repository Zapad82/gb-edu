package ExceptionsAndErrors.Seminar_3.hw;

// 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, 
// при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. 
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), 
// должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
// 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и 
// MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][] {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "k", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };

        try {
            try {
                int sum = sumArray(arr);
                System.out.println("Сумма элементов массива: " + sum);
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка: " + e.getMessage() + "- неверный размер массива. Должен быть 4х4");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage() + " - неверное значение массива");
            // System.out.println("Неверные данные в ячейке [" + i + "][" + j + "]: " +
            // row[j]);
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);

        }
    }

    // Метод `sumArray()` проверяет, что входящий массив имеет размер 4x4 и
    // выбрасывает исключение
    // `MyArraySizeException`, если это не так.
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4");
        }

        for (int i = 0; i < arr.length; i++) {
            String[] row = arr[i];
            if (row.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4x4");
            }
            for (int j = 0; j < row.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
