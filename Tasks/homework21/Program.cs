/*
Задача 21
Напишите программу, которая принимает на вход координаты двух 
точек и находит расстояние между ними в 3D пространстве.
A (3,6,8); B (2,1,-7), -> 15.84
A (7,-5, 0); B (1,-1,9) -> 11.53
*/

double getDistance (int xa, int ya, int za, int xb, int yb, int zb)
{
    double distance = Math.Sqrt((xa - xb)*(xa - xb) + (ya - yb) * (ya -yb) + (za - zb) * (za - zb));
    distance = Math.Round(distance,2);
    return distance;
}

Console.WriteLine("Введите координату x первой точки:");
int xa = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату y первой точки:");
int ya = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату z первой точки:");
int za = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату x второй точки:");
int xb = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату y второй точки:");
int yb = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Введите координату z второй точки:");
int zb = Convert.ToInt32(Console.ReadLine());
double answer = getDistance(xa, ya, za, xb, yb, zb);
Console.WriteLine(answer);