package OOP.Seminars.seminar4.hw_seminar4;

import java.util.*;

/*
 * Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
Создайте следующие детские классы:
• IsEven — ему дают целое число, он одобряет его, если оно чётное
• IsPositive — ему дают целое число, он одобряет его, если оно положительное
• BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
• BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил

Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
Продемонстрируйте, что это работает.
 */
public class Main {
    public static void main(String[] args) {

        // Для чисел: задаем список чисел

        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            integerList.add(new Random().nextInt(200) - 100);
        }
        System.out.println("\nДан набор положительных и отрицательных целых чисел:\n" + integerList + "\n");

        // Одобряет вывод, если число четное
        IsGood<Integer> isGoodInteger = new IsEven();
        System.out.println("Все чётные числа нашего списка:\n" + filter(integerList, isGoodInteger) + "\n");

        // Одобряет вывод, если число положительное
        IsGood<Integer> isGoodPositive = new IsPositive();
        System.out.println("Все положительные числа нашего списка:\n" + filter(integerList, isGoodPositive) + "\n");

        // Для строк: задаем список строк
        List<String> stringList = Arrays.asList(
                "Арбуз",
                "Дыня",
                "Абрикос",
                "Вишня",
                "Виноград",
                "Тыква",
                "Картофель",
                "Морковь",
                "Капуста",
                "Авокадо",
                "Апельсин",
                "Мандарин",
                "Банан",
                "Хрен",
                "Спаржа");
        System.out.println("Дан список строк:\n" + stringList + "\n");

        // Одобряет вывод, если элемент коллекции начинается на "А"
        IsGood<String> isGoodBeginsWithA = new BeginsWithA();
        System.out.println(
                "Все слова нашего списка, начинающиеся на 'А':\n" + filter(stringList, isGoodBeginsWithA) + "\n");

        // Одобряет вывод, если элемент коллекции начинается с заданной строки "Ка"
        IsGood<String> isGoodBegins = new BeginsWith("Ка");
        System.out
                .println("Все слова нашего списка, начинающиеся на 'Ка':\n" + filter(stringList, isGoodBegins) + "\n");
    }

    public static <ListData> List<ListData> filter(Iterable<ListData> array,
            IsGood<ListData> isGood) {
        ArrayList<ListData> newData = new ArrayList<ListData>();
        // новый массив, который после фильтра нужно вернуть вызывающему
        for (ListData element : array) {
            // проверка всех элементов из входящей коллекции, на основе реализации метода
            if (isGood.isGood(element) == true) {
                // добавляем элемент в новую коллекцию, если условие выполняется
                newData.add(element);
            }
        }
        // возвращаем новую коллекцию
        return newData;
    }
}
