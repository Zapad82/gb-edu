/*
Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22
*/

int numberOne = new int();
int numberTwo = new int();
int numberThree = new int();

Console.WriteLine("Введите первое число: ");
numberOne = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите второе число: ");
numberTwo = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите третье число: ");
numberThree = Convert.ToInt32(Console.ReadLine());

if (numberOne >= numberTwo & numberOne >= numberThree)
{
    Console.WriteLine($"Максимальное из этих трех чисел равно: {numberOne}");
}
if (numberTwo >= numberOne & numberTwo > numberThree)
{
    Console.WriteLine($"Максимальное число из этих трех чисел равно: {numberTwo}");
}
if (numberThree > numberOne & numberThree >= numberTwo)
{
    Console.WriteLine($"Максимальное число из этих трех чисел равно: {numberThree}");
}