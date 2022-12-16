package OOP.Seminars.seminar2.weapon1;
/*class Создайте базовый класс Оружие. У оружия есть название, повреждение, скорострельность, количество зарядов в обойме, звук при выстреле — это методы. Напишите метод, который делает один выстрел.
Напишите три класса-наследника Оружия. В них переопределите родительские методы.
Проверьте, как работают оба оружия.
 */

public abstract class Weapon {

    public abstract String getName();

    public abstract float getDamage();

    public abstract float rateOfFire();

    public abstract Integer bulletsAmount();

    public abstract String getSound();

}
