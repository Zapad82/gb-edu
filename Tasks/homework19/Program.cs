/*
Задача 19
Напишите программу, которая принимает на вход пятизначное 
число и проверяет, является ли оно палиндромом.
14212 -> нет
12821 -> да
23432 -> да
*/

Console.WriteLine("Введите пятизначное число для проверки на палиндром:");
int number = Convert.ToInt32(Console.ReadLine());
if (number < 9999 | number > 99999)
{
    Console.WriteLine("Вы ввели не пятизначное число. Попробуйте еще раз.");
}
else if (number > 9999 && number < 100000)
{
    //int i = 0;  
    int num5 = number % 10;
    int numberRev = number / 10;
    int num4 = numberRev % 10;
    numberRev = numberRev / 100;
    int num2 = numberRev % 10;
    int num1 = numberRev / 10;
    if (num5 == num1 && num4 == num2)
    {
        Console.WriteLine($"Число {number} является палиндромом.");
    }
    else
    {
        Console.WriteLine($"Число {number} - это не палиндром.");
    }
    //Console.WriteLine(num5);
    //Console.WriteLine(number);


}