/*
Задача 53.
Задайте двумерный массив. Напишите программу, 
которая поменяет местами первую и последнюю строку массива. 
*/

Console.WriteLine("Введите количество строк");
int rows = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите количество столбцов");
int columns = Convert.ToInt32(Console.ReadLine());

int[,] array = new int[rows, columns];

void FillArray(int[,] array)
{
    for(int i=0; i<array.GetLength(0); i++)
    {
        for(int j=0; j<array.GetLength(1); j++)
        {
            array[i,j] = new Random().Next(1,20);
        }
    }
}

int[,] ChangeArray(int[,] array)
{
    for(int j=0; j<array.GetLength(1); j++)
    {
       int temp = array[0,j];
       array[0,j] = array[array.GetLength(0) - 1, j];
       array[array.GetLength(0) - 1, j] = temp;
    }
    return array;
}

void PrintArray(int[,] array)
{
    for(int i=0; i<array.GetLength(0); i++)
    {
        for (int j=0; j<array.GetLength(1); j++)
        {
            Console.Write($"{array[i,j]} \t");
        }
        Console.WriteLine();
    }
}

FillArray(array);
PrintArray(array);
Console.WriteLine();
ChangeArray(array);
PrintArray(array);