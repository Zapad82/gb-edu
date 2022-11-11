/*
Задача 21: Напишите программу, которая принимает 
на вход координаты двух точек и находит расстояние 
между ними в 2D пространстве. 
A (3,6); B (2,1) -> 5,09 A (7,-5); B (1,-1) -> 7,21
*/

double getDistance (int xa, int ya, int xb, int yb)
{
    double distance = Math.Sqrt((xa - xb)*(xa - xb) + (ya - yb) * (ya -yb));
    distance = Math.Round(distance,2);
    return distance;
}

Console.WriteLine("Введите координату x первой точки:");
int xa = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату y первой точки:");
int ya = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату x второй точки:");
int xb = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату y второй точки:");
int yb = Convert.ToInt32(Console.ReadLine());

double answer = getDistance(xa, ya, xb, yb);
Console.WriteLine(answer);