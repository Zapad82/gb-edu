/*
Задача 54: Задайте двумерный массив. Напишите программу, которая
упорядочит по убыванию элементы каждой строки двумерного массива.
*/

void FillArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 20);
        }
    }
}

void PrintArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i, j]} \t");
        }
        Console.WriteLine();
    }
}

int[,] SortArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            for (int k = 0; k < array.GetLength(1) - 1; k++)
            {
                if (array[i, k] < array[i, k + 1])
                {
                    int temp = array[i, k + 1];
                    array[i, k + 1] = array[i, k];
                    array[i, k] = temp;
                }
            }
        }

    }
    return array;
}


Console.WriteLine("Введите количество строк");
int rows = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите количество столбцов");
int columns = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine();
Console.WriteLine("Двумерная таблица из случайных чисел:");
int[,] array = new int[rows, columns];
FillArray(array);
PrintArray(array);
Console.WriteLine();
Console.WriteLine("Двумерная таблица с упорядоченными по убыванию числами в строках:");
SortArray(array);
PrintArray(array);