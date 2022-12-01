
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



// 1. Реализовать алгоритм сортировки слиянием.
public class hw_seminar3 {
   private static int[] mergeSort(int[] ar) {
      // Базовый случай — это когда один элемент
      int n = ar.length;
      if (n <= 1) return ar;
  
      // Разделим массив на две части и рекурсивно отсортируем
      int[] left = mergeSort(Arrays.copyOfRange(ar, 0, n / 2));
      int[] right = mergeSort(Arrays.copyOfRange(ar, n / 2, n));
  
      // Объединим два массива в один больший
      return merge(left, right);
   }
  
    // Объединение двух отсортированных массивов в более крупный отсортированный массив
   private static int[] merge(int[] ar1, int[] ar2) {
      int n1 = ar1.length, n2 = ar2.length;
      int n = n1 + n2, i1 = 0, i2 = 0;
      int[] ar = new int[n];
  
      for (int i = 0; i < n; i++) {
        if (i1 == n1) {
          ar[i] = ar2[i2++];
        } else if (i2 == n2) {
          ar[i] = ar1[i1++];
        } else {
          if (ar1[i1] < ar2[i2]) {
            ar[i] = ar1[i1++];
          } else {
            ar[i] = ar2[i2++];
          }
        }
      }
      return ar;
    }
  
   public static void main(String[] args) {
      // ArrayList<Integer> array = new ArrayList<Integer>();

      // Random rand = new Random();
      // for (int i=0; i<10; i++) {
      //     int temp = rand.nextInt(100);
      //     array.add(temp);
      // }
      int[] array = {10, 4, 6, 4, 8, -13, 2, 3};
      array = mergeSort(array);
      System.out.println(Arrays.toString(array));
   }
}


// 2. Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
class removingEvenNumbers {
   public static void main(String[] args) {
      ArrayList<Integer> my_list = new ArrayList<>();
      Random rand = new Random();
      for (int i=0; i<10; i++) {
         int temp = rand.nextInt(100);
         my_list.add(temp);
      }
      System.out.println("Получен список случайных чисел: ");
      System.out.println(my_list);
      System.out.println("Удалены следующие чётные числа: ");
      for (int i=0;i<my_list.size();i++) {
         int even=my_list.get(i)%2;
         if (even==0){
            System.out.print(my_list.get(i) + " ");
            my_list.remove(i);
  
            // Add this:
            i--;
         }
      }
      System.out.println("");
      //Collections.sort(my_list);
      System.out.println("Получили список нечётных чисел: \n"+my_list);
   }
}


// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
class maxMinAverage {
   public static void main(String[] args) {
      ArrayList<Integer> my_list = new ArrayList<>();
      Random rand = new Random();
      for (int i=0; i<10; i++) {
         int temp = rand.nextInt(100);
         my_list.add(temp);
      }
      System.out.println("Получен список случайных чисел: ");
      System.out.println(my_list);
      int max = Collections.max(my_list);
      int min = Collections.min(my_list);
      System.out.println("Максимальное число в списке: ");
      System.out.println(max);
      System.out.println("Минимальное число в списке: ");
      System.out.println(min);
      double average = 0;
      if (my_list.size() > 0) {
         double sum = 0;
         for (int j = 0; j < my_list.size(); j++) {
            sum += my_list.get(j);
         }
         average = sum / my_list.size();
      }
      System.out.println("Среднее арифметическое списка равно: \n" + average);
   }
}


// 4*. (Необязательная задача повышенной сложности)
// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
// }
class collectionDifference {
   public static void main(String[] args) {

      // Получаем два списка
      List<Integer> list1 = new ArrayList<>();
      Random rand1 = new Random();
      for (int i=0; i<10; i++) {
         int temp = rand1.nextInt(10);
         list1.add(temp);
      }
      System.out.println("Коллекция целых чисел \"A\": " + list1);
      List<Integer> list11 = new ArrayList<>();
      for (int i = 0; i < list1.size(); i++) {
         int number = list1.get(i);
         list11.add(number);
      }
      // List list11 = List.copyOf(list1);
      //System.out.println(list11);
      ArrayList<Integer> list2 = new ArrayList<>();
      Random rand2 = new Random();
      for (int i=0; i<6; i++) {
         int temp = rand2.nextInt(20);
         list2.add(temp);
      }
      System.out.println("Коллекция целых чисел \"B\": " + list2);
      List<Integer> list22 = new ArrayList<>();
      for (int i = 0; i < list2.size(); i++) {
         int number = list2.get(i);
         list22.add(number);
      }      
      //List list22 = List.copyOf(list2);
      //System.out.println(list22);
      // Вычисляем разницу коллекций A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
      list1.removeAll(list2);
      System.out.println("Разница коллекций A - B: " + list1);

      // Вычисляем разницу коллекций B - A = все числа из второй коллекции, которые не содержатся в первой
      list22.removeAll(list11);
      System.out.println("Разница коллекций B - A: " + list22);

      // Вычисляем симметрическую разность: A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
      list1.addAll(list22);
      System.out.println("Симметрическая разность: A ^ B = " + list1);

     
   }


}
