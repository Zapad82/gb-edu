import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


// Задача 0. 
// Вывести приветствие
// Вывести текущее время
class seminar1_231122 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println(now.format(formatter));

    }
}


// Задача 1.
// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
class Hello_name {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}



// Задача 1+
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
class Poluchenie_dannyh_ot_vremeni {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");
        String name = iScanner.nextLine();
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 5 && hour < 12)
            System.out.printf("Доброе утро, %s!\n", name);
        else if (hour >= 12 && hour < 18)
            System.out.printf("Добрый день, %s!\n", name);
        else if (hour >= 18 && hour < 23)
            System.out.printf("Добрый вечер, %s!\n", name);
        else if (hour >= 23 && hour < 5)
            System.out.printf("Добрый ночи, %s!\n", name);
        iScanner.close();
    }
}


// Задача 2.
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
class maxCountOne {
    public static void main(String[] args) {
        int [] array = {1,1,0,1,1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                count++;
                if (max < count) max = count;
            }
            else {
                count = 0;
            }

        }
        System.out.println(max);
    }
}



// Задача 3.
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
class sortArray {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        int count = 0;
        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i] == val) {
                count++;
            }
            else break;
        }
        for (int i = 0; i < nums.length - count; i++) {
            if(nums[i] == val) {
                int temp = nums[nums.length - count - 1];
                nums[nums.length - 1 - count] = nums[i];
                nums[i] = temp;

                count++;
            }
        }
    
        for (int index = 0; index < nums.length; index++) {
        System.out.printf(nums[index] + " ");
        }
    }
}



// Задание 4.
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
class longStringPrefiks {
    public static void main(String[] args) {
        
    }
}