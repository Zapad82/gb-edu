/*
Задача 38: Задайте массив вещественных чисел. Найдите
разницу между максимальным и минимальным
элементов массива.
*/

Console.Clear();
Console.WriteLine("Введите число, которое задаст длину массива:");
int num = int.Parse(Console.ReadLine());
int [] GetArray(int size, int minValue, int maxValue) 
{ 
    int [] res = new int [size]; 
    for(int i = 0; i < size; i++) 
    { 
        res[i] = new Random().Next(minValue, maxValue + 1); 
        Console.Write($"{res[i]} "); 
    } 
    return res; 
} 
int [] array = GetArray(num, 0, 100); 
Console.WriteLine(); 

int maxI = array[0];
int minI = array[0];
for (int j=0; j<num; j++)
{
    if (array[j] < minI)
    {
        minI = array[j];
    }
    if (array[j] > maxI)
    {
       maxI =array[j];      
    }
}
Console.WriteLine($"Разница между максимальным и минимальным элементами массива равняется: {maxI-minI}");