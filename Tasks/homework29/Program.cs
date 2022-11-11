/*
Задача 29: Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
6, 1, 33 -> [6, 1, 33]
*/

int[] arr = new int[8]; // создали массив из восьми элементов

void RandomArray(int[] array)
{
for (int i = 0; i < arr.Length-3; i++)
    {
        //Создание объекта для генерации чисел
        Random rnd = new Random();
        //Получить случайное число (в диапазоне от 0 до 10)
        int value = rnd.Next(0, 100);
        arr[i] = value;
        Console.Write($"{arr[i]} ");
    }
}
void RandomArray2(int[] array)
{
for (int i = 0; i < arr.Length-5; i++)
    {
        //Создание объекта для генерации чисел
        Random rnd = new Random();
        //Получить случайное число (в диапазоне от 0 до 10)
        int value = rnd.Next(0, 100);
        arr[i] = value;
        Console.Write($"{arr[i]} ");
    }
}

RandomArray(arr); 
Console.WriteLine();
RandomArray2(arr);
Console.WriteLine();