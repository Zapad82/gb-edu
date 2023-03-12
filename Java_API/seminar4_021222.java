import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



// сравниваем время работы ArrayList и LinkedList
public class seminar4_021222 {
    public static void main(String[] args) {
        int repeatCount = 10_000;

        long begin = System.nanoTime(); // Текущее время в наносекундах

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < repeatCount; i++) {
            arrayList.add (i);
        }

        long mid = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < repeatCount; i++) {
            linkedList.add (i);
        }

        long end = System.nanoTime();
        System.out.printf("%f %f", (mid - begin) / 1e+9, (end - mid) / 1e+9);
    }
}


// Задание 1:
// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида 
// text~num
// Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
class TextNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine(); //ввод данных пользователя

            String[] textAndNum = input.split("~"); // разделяем строку по указанному разделителю в методе split
            if (textAndNum[0].equals("quit")) { // завершение программы
                break;
            }

            if (textAndNum.length < 2) {    // проверка на некорректное значение
                System.out.println("incorrect input");
                continue;
//                throw new IllegalStateException("incorrect input");
            }
            int i = Integer.parseInt(textAndNum[1]);

            if (textAndNum[0].equals("print")) {
                System.out.println(list.get(i));
                list.remove(i);
                continue;
            }

            list.add(i, textAndNum[0]);
            System.out.println(list);

        }
        scanner.close();
    }
}


// Задание 2
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая — последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
class Memory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();

        while (true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine(); //ввод данных пользователя

            if (input.equals("quit")) { // завершение программы
                break;
            }
            else if (input.equals("print")) {
                System.out.println(deque);               
            }
            else if (input.equals("revert")) {
                System.out.println(deque.pollFirst());
            }
            else {
                deque.addFirst(input);
            }
            System.out.println(deque);
        }

        scanner.close();
    }
}


// public class Ex3 { 
//     public static void main(String[] args) {
//          ArrayDeque <String> stack = new ArrayDeque<>(); 
//          while(true) { 
//             String str = scannerText(); 
//             if(str.equals("quit")){
//                  break; } 
//                  else if(str.equals("print")){ 
//                     Object [] strings = stack.toArray(); 
//                     for (int i = strings.length-1; i >= 0 ; i--){
//                          System.out.println(strings[i]); 
//                         } } else if (str.equals("revert")){ 
//                             System.out.println(stack.removeLast()); } else{
//                                  stack.add(str); } System.out.println(stack); 
//                                 } } 
//                                 public static String scannerText() { 
//                                     Scanner in = new Scanner(System.in); 
//                                     System.out.print("Введите сироку в формате text~num: ");
//                                      String text = in.nextLine(); return text; } } 