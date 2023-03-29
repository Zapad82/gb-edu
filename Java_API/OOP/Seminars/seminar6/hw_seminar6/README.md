# Задачи к семинару 6 по ООП.

## Задача 1. 
### Чтобы разблокировать телефон, пользователь может выбрать один из способов:

    • Без пароля
    • С пин-кодом (4-значное число)
    • По отпечатку пальца (кодируется строкой)
    • По распознаванию лица (кодируется строкой)

    Программист написал класс Unlocker, в котором хранятся поля от всех способов сразу:

        class Unlocker {
        private int mode; // режим
        private int pin; // на случай пин-кода
        private String fingerprint; // на случай отпечатка пальца
        private String faceID; // на случай лица
        }

    Здесь нарушен принцип SRP: класс имеет несколько незаивисимых причин меняться.

    Напишите решение, которое будет соответствовать SRP и OCP (мы хотим в будущем добавлять новые способы разблокировки).

    Одним из возможных решений будет использование интерфейса и абстрактного класса.

    1. Создаём интерфейс UnlockMethod с методом unlock(), который будет отвечать за разблокировку.
    2. Затем создаём абстрактный класс Unlocker, который будет использоваться для хранения всех вариантов разблокировки.
    3. Затем создаём реализации интерфейса UnlockMethod для каждого из способов разблокировки.
    4. Теперь при создании экземпляра Unlocker можно передать ему требуемый метод разблокировки. Это позволит нам легко добавлять новые способы разблокировки без изменения уже имеющихся классов.

## Задача 2. 
### Есть два самодельных класса коллекций:

    ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
        • getSize ()
        • get (int i)

    MutableList<T> — коллекция, которая допускает изменения. Методы:
        • getSize ()
        • get (int i)
        • set (int i, T newValue)
        • add (T newValue)
        • remove (T value)

    Реализуйте такую схему наследования между двумя этими классами, которая будет соответствовать принципу подстановки Лисков.