/*

Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

6 -> да
7 -> да
1 -> нет

*/

int monday = 1;
int tuesday = 2;
int wednesday = 3;
int thursday = 4;
int friday = 5;
int saturday = 6;
int sunday = 7;
Console.Write("Введите цифру, обозначающую день недели: ");
int addNumber = Convert.ToInt32(Console.ReadLine());
if (addNumber < 1 | addNumber > 7)
{
    Console.WriteLine("Вы ввели некорректное число. В неделе всего 7 дней.");
    Console.WriteLine("Перезапустите программу и введите корректное число.");
}
else
{
    if (addNumber == monday)
    {
        Console.WriteLine("Введенной цифре соответствует Понедельник. Это рабочий день.");
    }
    else if (addNumber == tuesday)
    {
        Console.WriteLine("Введенной цифре соответствует Вторник. Это рабочий день.");
    }
    else if (addNumber == wednesday)
    {
         Console.WriteLine("Введенной цифре соответствует Среда. Это рабочий день.");
    }
        else if (addNumber == thursday)
    {
         Console.WriteLine("Введенной цифре соответствует Четверг. Это рабочий день.");
    }
        else if (addNumber == friday)
    {
         Console.WriteLine("Введенной цифре соответствует Пятница. Это рабочий день.");
    }
        else if (addNumber == saturday)
    {
         Console.WriteLine("Введенной цифре соответствует Суббота. Это выходной день.");
    }
    else if (addNumber == sunday)
    {
        Console.WriteLine("Введенной цифре соответствует Воскресенье. Это выходной день.");      
    }
}