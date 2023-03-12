/*
Задача 36: Задайте одномерный массив, заполненный
случайными числами. Найдите сумму элементов, стоящих
на нечётных позициях.
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
int [] array = GetArray(num, -100, 100); 
Console.WriteLine(); 
int k=0;
for (int j = 1; j < num; j = j + 2)
    {
        k=k+array[j];
    }
Console.WriteLine($"Сумма элементов массива, стоящих на нечетных позициях равна: {k}");