/*
7. Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает последнюю цифру этого числа.
	456 -> 6
	782 -> 2
	918 -> 8
*/

int userNumber = new int();

Console.WriteLine("Введите трехзначное число: ");
userNumber = Convert.ToInt32(Console.ReadLine());

if (userNumber > 99 && userNumber < 1000)
{
    Console.WriteLine($"Последняя цифра вашего числа = {userNumber%10}");
}
else
{
   Console.WriteLine("Ошибка! Вы ввели не трехзначное число.");  
}
