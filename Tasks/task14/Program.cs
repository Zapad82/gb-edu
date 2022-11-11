/*
14. Напишите программу, которая принимает на вход число и проверяет, кратно ли оно одновременно 7 и 23.
14 -> нет 
46 -> нет 
161 -> да
*/

Console.WriteLine("Введите число: ");
int addNumber = Convert.ToInt32(Console.ReadLine());

int constanteOne = 7;
int constanteTwo = 23;

if (addNumber % constanteOne == 0 && addNumber % constanteTwo == 0)
{
    Console.WriteLine("Число кратно 7 и 23");
}
else
{
 
    Console.WriteLine("Число не кратно 7 и 23");
}
