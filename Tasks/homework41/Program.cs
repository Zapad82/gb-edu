/*
Задача 41: Пользователь вводит с клавиатуры M чисел. 
Посчитайте, сколько чисел больше 0 ввёл пользователь.

0, 7, 8, -2, -2 -> 2
-1, -7, 567, 89, 223-> 3
*/

Console.Clear();
Console.WriteLine("В данной задаче необходимо с клавиатуры ввести несколько положительных и отрицательных чисел.");
Console.WriteLine("Введите число, чтобы определить, сколько же раз вам придется еще вводить числа.");
int m = Convert.ToInt32(Console.ReadLine()); 
int[] BuildArray(int m)
{
    int[] arr = new int[m];
    for (int i=0; i<m; i++)
    {
        Console.Write("Введите положительное или отрицательное число: ");
        arr[i] = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine();
    }
    return arr;
}

void PrintArray(int[] arr) 
{
    Console.Write($"Вы ввели {m} чисел. ");
    Console.Write("В результате, получился массив: "); 
    for (int i = 0; i < arr.Length; i++) 
    {
        if (i == 0) Console.Write("["); 
        if (i < arr.Length - 1) Console.Write(arr[i] + ", "); 
        else Console.Write(arr[i] + "]"); 
    } 
} 

int[] Array = BuildArray(m); 
PrintArray(Array); 
Console.WriteLine();

int sumNegative = 0;
int sumPositive = 0;
for (int j=0; j < Array.Length; j++)
{
    if (Array[j] < 0)
    sumNegative = sumNegative + 1;
    else if (Array[j] > 0)
    sumPositive = sumPositive + 1;
}

Console.WriteLine($"Вы ввели {sumNegative} раз(-а) отрицательные числа и {sumPositive} раз(-а) положительные.");