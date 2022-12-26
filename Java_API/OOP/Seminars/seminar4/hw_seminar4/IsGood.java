package OOP.Seminars.seminar4.hw_seminar4;
/* Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет. */

public interface IsGood<InputData> {
    public boolean isGood(InputData item);
}
