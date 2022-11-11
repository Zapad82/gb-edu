/*
Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.

456 -> 5
782 -> 8
918 -> 1

*/

Console.Write("Введите трехзначное число: ");
int addNumber = Convert.ToInt32(Console.ReadLine());
int addNumberLength = addNumber.ToString().Length;
if (addNumberLength != 3 )
{
    Console.WriteLine("Вы ввели не трехзначное число.");
    //Console.WriteLine("Введите трехзначное число. ");
}
else
{
    addNumber = addNumber % 100;
    addNumber = addNumber / 10;
    Console.WriteLine($"Цифра в середине числа равняется: {addNumber}");
}