/*
Задача 52: Задайте двумерный массив из целых чисел.
Найдите среднее арифметическое элементов в каждом
столбце.

Например, задан массив:
1 4 7 2
5 9 2 3
8 4 2 4
Среднее арифметическое каждого
столбца: 4,6; 5,6; 3,6; 3.
*/

Console.Clear();
Console.Write("Введите количество строк в массиве: ");
int rows = Convert.ToInt32(Console.ReadLine());
Console.Write("Введите количество столбцов в массиве: ");
int columns = Convert.ToInt32(Console.ReadLine());

int[,] array = GetArray(rows, columns, 0, 10);
Console.WriteLine("С помощью генератора случайных чисел, мы получили массив: ");
PrintArray(array);
Console.WriteLine();
Console.WriteLine("Среднее арифметическое каждого столбца равняется: ");
for(int j=0; j<array.GetLength(1); j++)
{
    double arithmeticMean = 0;
    for (int i = 0; i < array.GetLength(0); i++)
    {
        arithmeticMean = (arithmeticMean + array[i, j]);
    }
    arithmeticMean = arithmeticMean / rows;
    Console.Write(arithmeticMean + "; ");
}

Console.WriteLine();

int[,] GetArray(int rows, int columns, int min, int max)
{
    int[,] result=new int[rows,columns];
    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<columns;j++)
        {
            result[i,j]=new Random().Next(min, max);
        }
    }
    return result;

}

void PrintArray(int[,] array)
{
    for(int i=0;i<array.GetLength(0);i++)
    {
        for(int j=0;j<array.GetLength(1);j++)
        {
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
}