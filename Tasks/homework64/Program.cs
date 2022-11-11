/*
Задача 64: Задайте значения M и N. Напишите программу, 
которая выведет все натуральные числа в промежутке от большего к меньшему.

M = 1; N = 5. -> ""5, 4, 3, 2, 1""

M = 4; N = 8. -> ""8, 7, 6, 5, 4""
*/

Console.Clear();

Console.WriteLine("Введите число M:");
int digitM = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите число N:");
int digitN = Convert.ToInt32(Console.ReadLine());

string Numbers(int digitM, int digitN)
{
    if (digitM <= digitN)
    {
        return $"{digitN} " + Numbers(digitM, digitN - 1);
    }
    else
    {
        return String.Empty;
    }


}


Console.WriteLine(Numbers(digitM, digitN));