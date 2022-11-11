/*
Задача 43. Напишите программу, которая найдёт точку пересечения двух прямых, 
заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
значения b1, k1, b2 и k2 задаются пользователем.

b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)
*/

Console.Clear();

Console.Write("Введите аргумент b1:");
int b1 = Convert.ToInt32(Console.ReadLine()); 

Console.Write("Введите аргумент k1:");
int k1 = Convert.ToInt32(Console.ReadLine()); 

Console.Write("Введите аргумент b2:");
int b2 = Convert.ToInt32(Console.ReadLine()); 

Console.Write("Введите аргумент k2:");
int k2 = Convert.ToInt32(Console.ReadLine()); 

double x = 0;
double y = 0; 
double Dot(double arg1, double arg2, double arg3, double arg4)
{
    //y=arg2*x+arg1, y=arg4*x+arg3;
    //arg2 * x + arg1 = arg4 * x + arg3;
    //arg4*x-arg2*x = arg1-arg3;
    //(arg4-arg2)*x = arg1-arg3;
    x = (arg1 - arg3)/(arg4 - arg2);
    //y = arg2 * x + arg1;
    y = arg4*x+arg3;
    return x;
    return y;
}

Dot(b1, k1, b2, k2);
Console.WriteLine($"Точкой пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2*x + b2 при значениях");
Console.WriteLine($"b1 = {b1}, k1 = {k1}, b2 = {b2}, k2 = {k2} будет точка ({x}; {y})");