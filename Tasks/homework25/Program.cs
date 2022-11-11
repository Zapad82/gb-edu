/*
Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
3, 5 -> 243 (3⁵)
2, 4 -> 16
*/

Console.Clear();
Console.WriteLine("Введите число \"A\"");
int numA = Int32.Parse(Console.ReadLine());
Console.WriteLine("Введите число \"B\"");
int numB = Int32.Parse(Console.ReadLine());
//Инициализируем метод с циклом
int AriseToThePowerB (int numberA, int numberB)
{
    int i = 1;
    int power = numA;
    while (i < numB)
    {
        power=power*numA;
        i++;
    }
    return power;
}
//Выводим результат возведения числа А в степень числа В
Console.WriteLine($"Число {numA} в степени {numB} равно {AriseToThePowerB(numA, numB)}");