/*
Задача 65: Задайте значения M и N. Напишите программу, которая
выведет все натуральные числа в промежутке от M до N.
M = 1; N = 5 -> "1, 2, 3, 4, 5"
M = 4; N = 8 -> "4, 6, 7, 8"
*/

Console.Clear();

Console.WriteLine("Введите число M:");
int firstUserName = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите число N:");
int secondUserName = Convert.ToInt32(Console.ReadLine());

string NumberRec(int firstUserName, int secondUserName)
{
    if(firstUserName <= secondUserName)
    {
        return $"{firstUserName} " + NumberRec(firstUserName + 1, secondUserName);
    }
    else
    {
        return String.Empty;
    }
}
Console.WriteLine(NumberRec(firstUserName, secondUserName));