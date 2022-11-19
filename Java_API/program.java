import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class program {
    public static void main(String[] args) {
        System.out.println("world");
    }
}

// Типы данных бывают: 1. Ссылочные, 2. Примитивные (boolean, int, short, long и т.д., float, double, Char)
// Создание переменной: <тип><идентификатор>; - это объявление переменной
// <идентификатор> = <значение>; - это инициализация переменной


// целые числа, кроме int
class Program_int
{
    public static void main(String[] args) {
        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456
    }
}

// вещественные числа
class Program_float
{
    public static void main(String[] args) {
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); //2.7
        System.out.println(pi); //3.1415
    }
}

// тип данных char - определяет отдельный символ
class Program_char
{
    public static void main(String[] args) {
        char ch = '1';
        System.out.println(Character.isDigit(ch)); //true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); //false
    }
}

// тип данных boolean
class Program_boolean
{
    public static void main(String[] args) {
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); //true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); //true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); //false
    }
}

// тип данных строки
class Program_string
{
    public static void main(String[] args) {
        String msg = "Hello world";
        System.out.println(msg); //Hello world
    }
}

// неявная типизация, это когда вместо int, boolean и прочее можно написать var
class Program_uny
{
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); //123
        var d = 123.456;
        System.out.println(d); //123.456
        System.out.println((getType(a))); // Integer
        System.out.println((getType(d))); // Double
        d = 1022;
        System.out.println(d);} //1022.0
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}

// Классы-обёртки применяются для использования деталей типа.
// Примитив | Обёртка
// -------------------
// int      | Integer
// short    | Short
// long     | Long
// byte     | Byte
// float    | Float
// double   | Double
// char     | Character
// boolean  | Boolean
class Program_obertka {
    public static void main(String[] args) {
        int i = 23_123_34; // _ - делит разряды числа
        String s ="qwer";
        s.charAt(1);
        System.out.println(Integer.MAX_VALUE);
    }
}

// Операции Java
// Присваивание: =
// Арифметические: *,/,+,-,%,++,--
// Операции сравнения: <, >, ==, !=, >=, <=
// Логические операции: ||, &&, ^, !
// Побитовые операции: <<, >>, &, |, ^

class Program_operacion {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(a++); // 123 (постфиксный инкремент)
        System.out.println(a); // 124
        System.out.println(++a); // 125 (префиксный инкремент)
        boolean f = 123 != 234;
        System.out.println(f);
        int aaa = 8;
        // 1000 
        // a = a << 1;
        System.out.println(aaa << 1); // побитовый сдвиг - удаляет последнее число в двумерном представлении числа 8
        // 10000
        int aa = 5;
        int bb = 2;
        System.out.println(aa | bb); // 111 (5 или 2 побитовое будет 7)
        System.out.println(aa & bb); // 000 (5 и 2 побитовое будет 0)
        System.out.println(aa ^ bb); // 111 (5 или разделительное или 2 будет 7)
        String s = "qwer"; // 4, индексы от 0 до 3
        boolean bs = s.length() >= 5 && s.charAt(4) == '1';
        System.out.println(bs);
    }
}

// Массивы

// Одномерные
class Program_odnomernye_massivy {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length); // 10

        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5
    }
}

// Многомерные
class Program_mnogomernye_massivy {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
        }
    }
}

class Program_mnogomernye_massivy1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println();
        }
    }
}

// Получение данных из терминала
// import java.util.Scanner;
class Programm_poluchenie_dannyh {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}

// Проверка на соответствие получаемого типа
// import java.util.Scanner;
class Programm_poluchenie_dannyh_proverka {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); // здесь проверка запроса на ввод числа. А было ли число введено?
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}


// Форматированный вывод
class Programm_formatir_vyvod {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }
}

// Виды спецификаторов
// %d: целочисленных значений
// %x: для вывода шестнадцатеричных чисел
// %f: для вывода чисел с плавающей точкой
// %e: для вывода чисел в экспоненциальной форме, например 3.1415e+01
// %с: для вывода одиночного символа
// %s: для вывода строковых значений


// Вывод количества знаков после запятой
class Program_posle_zapyatoy {
    public static void main(String[] args) {
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3.141500
        System.out.printf("%.2f\n", pi); // 3.14
        System.out.printf("%.3f\n", pi); // 3.141
        System.out.printf("%e\n", pi); // 3.141500e+00
        System.out.printf("%.2e\n", pi); // 3.14e+00
        System.out.printf("%.3e\n", pi); // 3.141e+00  
    }
}


// Работа с файлами. Создание и запись (дозапись) файла.
// import java.io.FileWriter;
// import java.io.IOException;
class Program_sozdanie_i_zapis {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}