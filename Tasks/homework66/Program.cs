/*
Задача 66: Задайте значения M и N. Напишите программу, 
которая найдёт сумму чётных чисел натуральных элементов в промежутке от M до N.

M = 1; N = 15 -> 56
M = 4; N = 8. -> 18
*/

Console.Clear();

Console.WriteLine("Введите начальное число M:");
int numberM = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите начальное число N:");
int numberN = Convert.ToInt32(Console.ReadLine());

if (numberM % 2 != 0)
{
    numberM++;
}

int EvenNumberSum(int numberM, int numberN)
{
    if (numberM <= numberN)
    {
        return numberM + EvenNumberSum(numberM + 2, numberN);
    }
    else
    {
        return 0;
    }
}
Console.WriteLine(EvenNumberSum(numberM, numberN));