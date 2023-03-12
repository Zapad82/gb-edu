import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.sound.midi.Soundbank;

// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class hw_seminar4 {
    public static void main(String[] args) {

        // Задаем какой-то список
        String str1 = new String("One");
        String str2 = new String("Two");
        String str3 = new String("Three");
        String str4 = new String("Four");
        String str5 = new String("Five");

        LinkedList<String> listElements = new LinkedList<>();
        listElements.add(str1);
        listElements.add(str2);
        listElements.add(str3);
        listElements.add(str4);
        listElements.add(str5);

        System.out.println("У нас есть список: " + listElements + ". Его нужно перевернуть.");
        
        // добавляем список в обратном порядке 
        for (int i = listElements.size()-1; i >= 0;  i-- ) {
            listElements.add(listElements.get(i));
        }

        // удаляем лишние элементы
        for (int i = 0; i < listElements.size(); i++) {
            listElements.remove(listElements.get(i));
        }

        System.out.println("Перевернутый список будет вот такой:" + listElements);
    }
}




// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
class enqueueDequeueFirst{
    public static void main(String[] args) {

        Queue<String> queueAdd = new LinkedList<>();

        // Используя Queue ставим элемент в конец очереди
        queueAdd.add("One"); // элемент поставлен в конец очереди
        queueAdd.add("Two"); 
        queueAdd.add("Three"); 
        queueAdd.add("Four"); 
        queueAdd.add("Five"); 

        System.out.println("Queue: " + queueAdd);

        // Возвращаем первый элемент из очереди:
        System.out.println("Первый элемент в очереди: \"" + ((LinkedList<String>) queueAdd).getFirst() + "\"");
        // System.out.println("Queue: " + queueAdd);
        
        // Используем dequeue(), чтобы вернуть первый элемент из очереди и удалить его
        ((LinkedList<String>) queueAdd).pollFirst();
        System.out.println("Queue (удален первый элемент в очереди): " + queueAdd);
    }
}




// 3*. Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6
class postfixCalculate {

    private static Scanner input = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Введите данные и операции в обратной польской записи через пробел, например, 5 4 3 - +");

        String str = input.nextLine(); // ожидаем ввода от пользователя
        String[] strings = str.split(" "); // сплитим введенные данные по пробелу

        Stack<Double> stack = new Stack<Double>(); // создаем стек
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i])); // если элемент число, то кладем его в стопку стека
            }
            else {
                double tmp1 = stack.pop(); // создаем две временные переменные для операций
                double tmp2 = stack.pop();

                switch (strings[i]) // проверяем, какую операцию нужно выполнить
                {
                    case "+":
                        stack.push(tmp1 + tmp2); // выполняем операцию и отправляем результат в стек
                    break;
                    case "-":
                        stack.push(tmp2 - tmp1);
                    break;
                    case "*":
                        stack.push(tmp1 * tmp2);
                    break;
                    case "/":
                        stack.push(tmp2 / tmp1);
                    break;
                }
            }
        }

        if (!stack.empty()) {
            System.out.println("Результат: " + stack.pop()); // выводим результат из стека (последний запушенный элемент)
        }
        else {
            System.out.println("Ошибка"); // информация об ошибке, если где-то неправильный ввод данных
        }
    }

    // проверка введенных данных на число
    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } 
        catch (NumberFormatException ex){
            return false;
        }
    }
}