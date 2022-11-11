/*
Задача 68: Напишите программу вычисления функции Аккермана
с помощью рекурсии. Даны два неотрицательных числа m и n.(необязательная)
m = 2, n = 3 -> A(m,n) = 29
*/

Console.Clear();

Console.WriteLine("Введите начальное число M:");
int numberM = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Введите начальное число N:");
int numberN = Convert.ToInt32(Console.ReadLine());

int AkkermanFunction(int numberM, int numberN)
{
    if(numberM==0)
    {
        return numberN + 1;
    }
    if(numberM>0 && numberN==0)
    {
        return AkkermanFunction(numberM-1, 1);
    }
    if(numberM>0 && numberN>0)
    {
        return AkkermanFunction(numberM-1, AkkermanFunction(numberM, numberN-1));
    }
    else
    {
        return AkkermanFunction(numberM, numberN);
    }
}

Console.WriteLine(AkkermanFunction(numberM, numberN));