/*
Задача 56: Задайте прямоугольный двумерный массив. Напишите
программу, которая будет находить строку с наименьшей суммой элементов.
*/

Console.WriteLine("Введите количество строк");
int rows = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите количество столбцов");
int columns = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine();
Console.WriteLine("Двумерная таблица из случайных чисел:");
int[,] array = new int[rows, columns];
FillArray(array);
PrintArray(array);


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

int minSumRow = 0;
int sumRow = SumRowElements(array, 0);
for (int i = 1; i < array.GetLength(0); i++)
{
  int tempSumRow = SumRowElements(array, i);
  if (sumRow > tempSumRow)
  {
    sumRow = tempSumRow;
    minSumRow = i;
  }
}

int SumRowElements(int[,] array, int i)
{
  int sumRow = array[i,0];
  for (int j = 1; j < array.GetLength(1); j++)
  {
    sumRow += array[i,j];
  }
  return sumRow;
}

Console.WriteLine();
Console.WriteLine($"{minSumRow+1} строкa является строкой с наименьшей суммой элементов. Сумма элементов в ней равна {sumRow}.");