/*
Напишите программу, которая на вход принимает два числа и проверяет, является ли втрое число квадратом первого.
a = 5; b = 25 -> да 
a = 2 b = 10 -> нет 
a = 9; b = -3 -> нет 
a = -3 b = 9 -> да
*/

int userNumberOne = new int();
int userNumberTwo = new int();

Console.WriteLine("Введите первое число: ");
userNumberOne = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Ведите второе число: ");
userNumberTwo = Convert.ToInt32(Console.ReadLine());

if (userNumberTwo == userNumberOne * userNumberOne)
{
    Console.WriteLine("да");
}
else{
    Console.WriteLine("нет");
}