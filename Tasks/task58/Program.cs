/*
Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
Например, даны 2 матрицы:
2 4 | 3 4
3 2 | 3 3
Результирующая матрица будет:
18 20
15 18
*/

Console.WriteLine("Введите количество строк для матрицы №1:");
int rows = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите количество столбцов для матрицы №1 (они же - количество строк для матрицы №2):");
int columns1rows2 = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите количество столбцов для матрицы №2:");
int columns2 = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine();
Console.WriteLine("Матрица №1 из случайных чисел:");
int[,] array1 = new int[rows, columns1rows2];
FillArray(array1);
PrintArray(array1);
Console.WriteLine();
Console.WriteLine("Матрица №2 из случайных чисел:");
int[,] array2 = new int[columns1rows2, columns2];
FillArray(array2);
PrintArray(array2);
Console.WriteLine();



void FillArray(int[,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i, j] = new Random().Next(1, 100);
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


int[,] resultArray1Array2 = new int[rows, columns2];
void CompositionArray1Array2(int[,] array1, int[,] array2, int[,] resultArray1Array2)
{
    for (int i = 0; i < resultArray1Array2.GetLength(0); i++)
    {
        for (int j = 0; j < resultArray1Array2.GetLength(1); j++)
        {
            int sum = 0;
            for (int k = 0; k < array1.GetLength(1); k++)
            {
                sum += array1[i, k] * array2[k, j];
            }
            resultArray1Array2[i, j] = sum;
        }
    }
}

CompositionArray1Array2(array1, array2, resultArray1Array2);
Console.WriteLine($"Произведение первой и второй матриц:");
PrintArray(resultArray1Array2);