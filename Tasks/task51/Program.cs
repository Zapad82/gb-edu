/*
Задача 51: Задайте двумерный массив. Найдите сумму
элементов, находящихся на главной диагонали (с индексами
(0,0); (1;1) и т.д.
Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
Сумма элементов главной диагонали: 1+9+2 = 12
*/

Console.Clear();
Console.Write("Введите количество строк массива: ");
int rows = int.Parse(Console.ReadLine());

Console.Write("Введите количество столбцов массива:");
int columns = int.Parse(Console.ReadLine());
int[,] array = GetArray(rows, columns, 0,20);
PrintArray(array);
Console.WriteLine();
Console.WriteLine("Сумма элементов находящихся на главной диагонали = " + SumOfNumbersInIndex(array));


int[,] GetArray(int rows, int columns, int min, int max)
{
    int[,] resultArray = new int[rows,columns];
    for (int i=0; i<rows; i++)
    {
        for (int j=0;j<columns; j++)
        {
            resultArray[i,j] = new Random().Next(min,max);
        }
    }
    return resultArray;
}

void PrintArray(int[,] array)
{
    for(int i=0;i<array.GetLength(0); i++)
    {
        for (int j=0; j<array.GetLength(1);j++)
        {
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
}

int SumOfNumbersInIndex (int [,] array)
{
    int sum=0;

    for (int i =0; i<array.GetLength(0); i++)
    {
        for (int j =0; j<array.GetLength(1); j++)
        {
            if (i==j)
            {
                sum = sum +array[i,j];
            }
        }
    }
    return sum;
}



