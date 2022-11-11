/*
Задача 60: Сформируйте трёхмерный массив из неповторяющихся
двузначных чисел. Напишите программу, которая будет построчно выводить
массив, добавляя индексы каждого элемента.
*/

Console.WriteLine($"Введите размер массива X x Y x Z:");
Console.WriteLine("Введите X:");
int x = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите Y:");
int y = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine("Ведите Z:");
int z = Math.Abs(Convert.ToInt32(Console.ReadLine()));
Console.WriteLine();
Console.WriteLine("Трехмерная таблица из случайных неповторяющихся двузначных чисел c построчным выводом массива и добавлением индексов каждого элемента:");
int[,,] arrayXYZ = new int[x, y, z];
FillArray(arrayXYZ);
PrintArray(arrayXYZ);

void FillArray(int[,,] arrayXYZ)
{
    int[] temp = new int[arrayXYZ.GetLength(0) * arrayXYZ.GetLength(1) * arrayXYZ.GetLength(2)];
    int num;
    for (int i = 0; i < temp.GetLength(0); i++)
    {
        temp[i] = new Random().Next(10, 100);
        num = temp[i];
        if (i >= 1)
        {
            for (int j = 0; j < i; j++)
            {
                while (temp[i] == temp[j])
                {
                    temp[i] = new Random().Next(10, 100);
                    j = 0;
                    num = temp[i];
                }
                num = temp[i];
            }
        }
    }

    int count = 0;
    for (int x = 0; x < arrayXYZ.GetLength(0); x++)
    {
        for (int y = 0; y < arrayXYZ.GetLength(1); y++)
        {
            for (int z = 0; z < arrayXYZ.GetLength(2); z++)
            {
                arrayXYZ[x, y, z] = temp[count];
                count++;
            }
        }
    }
}


void PrintArray(int[,,] arrayXYZ)
{
    for (int i = 0; i < arrayXYZ.GetLength(0); i++)
    {
        for (int j = 0; j < arrayXYZ.GetLength(1); j++)
        {
            Console.Write($"X{i} Y{j} ");
            for (int k = 0; k < arrayXYZ.GetLength(2); k++)
            {
                Console.Write($"Z{k}={arrayXYZ[i, j, k]}; ");
            }
            Console.WriteLine();
        }
        Console.WriteLine();
    }
}

Console.WriteLine();