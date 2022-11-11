/*
Задача 26.
Напишите программу, которая принимает на вход число и выдаёт 
количество цифр в числе. 456 -> 3 78 -> 2 89126 -> 5 
*/

Console.Clear();
Console.WriteLine("Введите число:");
int num = int.Parse(Console.ReadLine());

int numLength(int number)
{
    int numberLength = num.ToString().Length;
    return numberLength;
}
Console.WriteLine($"{num} => {numLength(num)}");