import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class seminar5_061222 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportToLastName = new HashMap<>();
        passportToLastName.put (123_456, "Иванов");
        passportToLastName.put (321_456, "Васильев");
        passportToLastName.put (234_561, "Петрова");
        passportToLastName.put (234_432, "Иванов");
        passportToLastName.put (654_321, "Петрова");
        passportToLastName.put (345_678, "Иванов");
        System.out.println(passportToLastName);
        String lastName = passportToLastName.get (123_456);
        System.out.println(lastName);
        if (passportToLastName.containsKey(123_456))
        System.out.println("Такой паспорт существует!");
        for (Map.Entry<Integer, String> entry : passportToLastName.entrySet()) if (entry.getValue().equals("Иванов"))
        System.out.println(entry);
    }
}


// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true


class Izomorf {
    public static void main(String[] args) {
        String first = "foot";
        String second = "baa";

        Boolean res = isIsomorph(first, second);
        System.out.println(res);
    }
    public static boolean isIsomorph(String first_str, String sec_str){
        Map<Character, Character> dictionary = new HashMap<>();
        if(first_str.length()==sec_str.length()){
            for (int i = 0; i < first_str.length(); i++) {
                if(dictionary.containsKey(first_str.charAt(i))){
                    if(dictionary.get(first_str.charAt(i)) != sec_str.charAt(i)){
                        return false;
                    }
                }
                else dictionary.put(first_str.charAt(i), sec_str.charAt(i));
            }
        return true;
        }
        else return false;
    }

}


// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

class Task2 {
    public static void main(String[] args) {
        printResult(expression: "a+(d*3)");
        printResult(expression: "[a+(1*3)");
        printResult(expression: "[6+(3*3)]");
        printResult(expression: "{a}[+]{(d*3)}");
        printResult(expression: "<{a}+{(d*3)}>");
        printResult(expression: "{a+]}{(d*3)}");
    }
    static boolean areBracketsPaired(String expression) {
        HashMap<Character, Character> openingToClosingBrackets = new HashMap<>();
        openingToClosingBrackets.put(key:'(', value:')');
        openingToClosingBrackets.put(key:'[', value:']');
        openingToClosingBrackets.put(key:'{', value:'}');
        openingToClosingBrackets.put(key:'<', value:'>');

        Deque<Character> bracketsInExpression = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            if (openingToClosingBrackets.containsKey(expression.charAt(i))) { // является открывающей скобкой
                bracketsInExpression.addLast(expression.charAt(i));
            }
            else if (openingToClosingBrackets.containsValue(expression.charAt(i))) {
                // является закрывающей скобкой
                if (bracketsInExpression.size() == 0) return false;
                else if (expression.charAt(i) == bracketsInExpression.removeLast()) {
                    continue;
                } else return false;
            }
        }

        return true;

    }

    static void printResult(String expression) {
        System.out.println(String.format(format: "%s; %s", expression, areBracketsPaired(expression) ? "true" : "false"));
    }
}