/*
Задача 2: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
a = 5; b = 7 -> max = 7
a = 2 b = 10 -> max = 10
a = -9 b = -3 -> max = -3
*/

int numberOne = new int();
int numberTwo = new int();

Console.WriteLine("Введите первое число: ");
numberOne = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите второе число: ");
numberTwo = Convert.ToInt32(Console.ReadLine());

if (numberOne > numberTwo)
{
    Console.WriteLine($"max = {numberOne}");
    Console.WriteLine($"min = {numberTwo}");
}

else
{
    Console.WriteLine($"max = {numberTwo}");
    Console.WriteLine($"min = {numberOne}");
}

if (numberOne == numberTwo)
{
    Console.WriteLine("Ошибка. Введены одинаковые числа.");
}
