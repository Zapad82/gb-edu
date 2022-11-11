/*
Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.

645 -> 5

78 -> третьей цифры нет

32679 -> 6

*/
int constantaNumber = 3;
Console.Write("Введите число: ");
int addNumber = Convert.ToInt32(Console.ReadLine());
int addNumberLength = addNumber.ToString().Length;
if (addNumberLength < constantaNumber)
{
    Console.WriteLine("Введенное число меньше, чем трехзначное:");
    Console.WriteLine("Третьей цифры нет!");
}
else
{
    string addNumberString = addNumber.ToString();
    int lengthAddNumberString = addNumberString.Length;
    Console.WriteLine($"Третья цифра в числе равняется: {addNumberString[constantaNumber - 1]}");
}