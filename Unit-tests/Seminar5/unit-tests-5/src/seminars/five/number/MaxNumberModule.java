package seminars.five.number;

//Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
//        максимальное число в этом списке.
//        Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
//        тест, который проверяет, что оба модуля работают вместе правильно


import java.util.List;

public class MaxNumberModule {
    public int maxNumberInList (List<Integer> list) {
        int max = 0;
        for (Integer elem : list) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
}
