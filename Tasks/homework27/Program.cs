/*
Задача 27: 
Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
452 -> 11
82 -> 10
9012 -> 12
*/

Console.Clear(); //чистим консоль
Console.Write("Введите число: ");
int numA = Int32.Parse(Console.ReadLine());

//инициализируем функцию для нахождения суммы цифр в числе
int SumNum (int number)
{
    int iter = numA.ToString().Length;
    int temp = 0;
    int index = 0;
    while(index<iter)
    {
    
            int temp1 = numA%10;
            numA = numA / 10;
            temp = temp + temp1;
            index++;
    
    }
    int result = temp;
    return result;
}

 Console.WriteLine($"Сумма цифр в числе {numA} равняется {SumNum(numA)}");
