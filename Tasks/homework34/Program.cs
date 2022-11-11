/*
Задача 34: Задайте массив заполненный случайными
положительными трёхзначными числами. Напишите
программу, которая покажет количество чётных чисел в
массиве.
Пример [345, 897, 568, 234] -> 2
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
int [] array = GetArray(num, 99, 1000); 
Console.WriteLine(); 
int k=0;
for (int j = 0; j < num; j++)
{
    if (array[j] % 2 == 0)
    {
        k=k+1;
    }
}
Console.WriteLine($"Чётных чисел в данном массиве равно: {k}");
