/*
Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
5 -> 2, 4
8 -> 2, 4, 6, 8
*/

int number = new int();
int Count1 = new int();
Console.WriteLine("Посмотрим на четные числа от 1 до N?");
Console.WriteLine("Введите число N: ");
number = Convert.ToInt32(Console.ReadLine());
Count1 = 1;
Console.WriteLine("Вот чётные числа в диапазоне:");
while (Count1 > 0 && Count1 <= number)
{
    if (Count1 % 2 == 0)
    {
        Console.Write($"{Count1}  ");
    }
    Count1 = Count1 + 1;
}
