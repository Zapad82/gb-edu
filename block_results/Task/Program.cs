/*
**Задача:** 
Написать программу, которая из имеющегося массива строк формирует массив из строк, 
длина которых меньше либо равна 3 символа. Первоначальный массив можно ввести с клавиатуры, 
либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, 
лучше обойтись исключительно массивами.


**Примеры:**
["hello", "2", "world", ":-)"] -> ["2", ":-)"]
["1234", "1567", "-2", "computer science"] -> ["-2"]
["Russia", "Danemark", "Kazan"] ->[]
*/

Console.Clear();
Console.WriteLine("Введите количество элементов массива:");
int length = Convert.ToInt32(Console.ReadLine());

string[] massive = new string[length]; //объявляем массив строк длиной length, которую ввел пользователь
for (int i = 0; i < length; i++)
{
    Console.Write("Введите строку № {0}:\r\n ", i + 1);
    massive[i] = Console.ReadLine(); //Заполняем массив
}
Console.WriteLine();
Console.WriteLine("Мы получили такой массив:");
Console.Write("[");
for (int i = 0; i < length; i++)
{
    Console.Write(massive[i]); //выводим массив на экран
    if (i < length - 1)
    {
        Console.Write(" "); //делаем красивый вывод массива
    }
}
Console.Write("]");
Console.WriteLine();
Console.WriteLine("Массив, в котором длина символов не превышает 3:");
Console.Write("[");
for (int i = 0; i < length; i++)
{
    if (massive[i].Length <= 3)
    {
        Console.Write(massive[i]); //ищем индексы, удовлетворяющие условию задачи (длина символов меньше или равно 3)
        //и выводим на экран
        if (i < length - 1)
        {
            Console.Write(" "); //делаем красивый вывод массива
        }
    }
}
Console.Write("]");
Console.WriteLine();
Console.Write("Нажмите [Enter] для выхода...");
Console.ReadLine();
