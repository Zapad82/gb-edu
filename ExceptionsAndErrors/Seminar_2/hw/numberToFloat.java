package ExceptionsAndErrors.Seminar_2.hw;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class numberToFloat {

    public static void main(String[] args) {
        float number = readFloatFromConsole();
        System.out.println("Число преобразовано во FLOAT: " + number);
    }

    // метод ожидает ввода числа, преобразовывает его или проверяет введенный символ
    // на валидность
    public static float readFloatFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            // ожидаем ввода
            String input = scanner.nextLine();
            try {
                // пытаемся преобразовать введенные данные в тип float: Float.parseFloat()
                float number = Float.parseFloat(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите число.");
            }
        }
    }
}
