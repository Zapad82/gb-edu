 /*
 Напишите программу, которая будет выдавать название дня недели по заданному номеру.
	3 -> Среда 
    5 -> Пятница
*/

int userNumber = new int();
Console.WriteLine("Введите целое число от 1 до 7 включительно: ");
userNumber = Convert.ToInt32(Console.ReadLine());
if (userNumber == 1) 
{
    Console.WriteLine("Понедельник");
}
if (userNumber == 2) 
{
    Console.WriteLine("Вторник");
}
if (userNumber == 3) 
{
    Console.WriteLine("Среда");
}
if (userNumber == 4) 
{
    Console.WriteLine("Четверг");
}
if (userNumber == 5) 
{
    Console.WriteLine("Пятница");
}
if (userNumber == 6) 
{
    Console.WriteLine("Суббота");
}
if (userNumber == 7) 
{
    Console.WriteLine("Воскресенье");
}
if (userNumber < 1)
{
    Console.WriteLine("Введено некорректное число");
}
if (userNumber > 7)
{
    Console.WriteLine("Введено некорректное число");
}
