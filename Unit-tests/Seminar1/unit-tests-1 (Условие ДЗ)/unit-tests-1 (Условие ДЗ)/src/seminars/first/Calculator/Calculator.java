package first.Calculator;
import static org.assertj.core.api.Assertions.*;

public class Calculator {
    private static int number;

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num, int i, int j) {
        //  0
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        //  Отрицательные числа
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }
        //  Дробные значения корней
        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;
        //  Целые
            // if(number < 0) {
            //     throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            // }
            // return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }
        double discountAmount = purchaseAmount * discountPercentage / 100;
        return purchaseAmount - discountAmount;

    }

    public static double calculateDiscount(int i, int j) {
        return 0;
    }

    public static Object squareRootExtraction(int num, int i, int j) {
        return null;
    }

}