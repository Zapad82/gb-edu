import org.testng.asserts.Assertion;
import static org.assertj.core.api.Assertions.*;

import seminars.first.Calculator.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        // Проверка базового функционала с целыми числами:
        if (8 != Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (0 != Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (14 != Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }

        if (2 != Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Случаи с неправильными аргументами
        // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
        try {
            Calculator.calculation(8, 4, '_');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: _")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений:
        assert 8 == Calculator.calculation(2, 6, '+');
        assert 0 == Calculator.calculation(2, 2, '-');
        assert 14 == Calculator.calculation(2, 7, '*');
        assert 2 == Calculator.calculation(100, 50, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        (assertThat(Calculator.calculation(2, 6, '+'))).equals(8);
        (assertThat(Calculator.calculation(2, 2, '-'))).equals(0);
        (assertThat(Calculator.calculation(2, 7, '*'))).equals(14);
        (assertThat(Calculator.calculation(100, 50, '/'))).equals(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(169));

        // Проверка скидки 10% на покупку в размере 1000
        double result = Calculator.calculatingDiscount(1000, 10);
        Assertion.assertThat(result).isEqualTo(900);

        // Проверка скидки 20% на покупку в размере 2000
        result = Calculator.calculateDiscount(2000, 20);
        Assertion.assertThat(result).isEqualTo(1600);

        // Проверка скидки 0% на покупку в размере 500
        result = Calculator.calculateDiscount(500, 0);
        Assertions.assertThat(result).isEqualTo(500);

        // Проверка скидки 100% на покупку в размере 300
        result = Calculator.calculateDiscount(300, 100);
        Assertions.assertThat(result).isEqualTo(0);

        // Проверка с отрицательной суммой покупки
        Calculator.calculateDiscount(-100, 10);

        // Проверка с отрицательным процентом скидки
        Calculator.calculateDiscount(100, -10);

        // Проверка с процентом скидки больше 100
        Calculator.calculateDiscount(100, 110);
    }


        // Примерные решения домашних заданий из 1 лекции:

        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
        // необходимые проверки для него используя граничные случаи
        void assertThatThrownBy(() -> seminars.first.Calculator.Calculator.squareRootExtraction(0, 1, -1)).isInstanceOf(SomeStateException.class);

        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
        assertThatThrownBy(() ->
               seminars.first.Calculator.Calculator.calculation(5, 0, '/')
        ).isInstanceOf(ArithmeticException.class);

        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
        // в каком случае стандартное сообщение об ошибке будет более информативным?
        if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }
        assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
        assertThat(seminars.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(0);
    }
}