/*
Задача 69: Напишите программу, которая на вход принимает два числа A и B, и
возводит число А в целую степень B с помощью рекурсии.
A = 3; B = 5 -> 243 (3⁵)
A = 2; B = 3 -> 8 
*/

Console.Clear();
Console.WriteLine("Введите число A:");
int number = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите число B:");
int degree = Convert.ToInt32(Console.ReadLine());

int Pow(int number, int degree)
{
    return degree == 0 ? 1 : Pow(number, degree - 1) * number;
}
Console.WriteLine(Pow(number, degree));