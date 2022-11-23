import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class hw_seminar1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число для вычисления n-ного треугольного числа и его факториала: ");
        int n = iScanner.nextInt();
        if (n > 0) {
            int t = (n*(n+1))/2;
            System.out.printf("n-ное треугольное число при n=" + n + " равняется " + t + ";\n");
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.printf("n-факториал при n=" + n + " будет " + factorial + ".\n");
        }
        else if (n == 0) {
            System.out.printf("n-ное треугольное число при n=" + n + " равняется " + n + ";\n");
            System.out.printf("n-факториал при n=" + n + " - это исключительный случай и равняется 1.\n");
        }
        else {
            System.out.println("Ошибка! Вы ввели отрицательное число. Перезапустите программу.");
        }
        iScanner.close();        
    }


}



// 2. Вывести все простые числа от 1 до 1000 
class primeNumbers {
    public static void main(String[] args) {
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                prime.add(i);
            }
        }
        System.out.println("Простые числа в диапазоне от 1 до 1000:\n" + prime.toString() + "\nВсего их:" + prime.size() + "\n");
    }
}



// 3. Реализовать простой калькулятор
class calculator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите действие (+, -, / или *): ");
        char mathAction = iScanner.next().charAt(0);
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        int res;
        switch(mathAction) {
            case '+': res = a + b;
                break;
            case '-': res = a - b;
                break;
            case '*': res = a * b;
                break;
            case '/': res = a / b;
                break;
            default: System.out.println("Ошибка! Введите корректный оператор. Перезапустите программу.");
                return;
        }
        System.out.println("Результат вычисления:");
        System.out.println(a + " " + mathAction + " " + b + " = " + res);
    }
 
}


/* 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
например 1? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.*/
// class whatNumbers {
//     public static void main(String[] args) {
//         String s = "1?+?5=69";



// }