/*

Задача 22: Напишите программу, которая принимает на 
вход число (N) и выдаёт таблицу квадратов чисел от 1 до N. 
5 -> 1, 4, 9, 16, 25. 2 -> 1,4 

*/

/*
int squareOneToN(int n, int i, int answer)
{
    while (i <= n)
    {
        answer = i * i;
        Console.Write(answer + " ");
        i++;
    }
    return i;
}
int i = 1;
int answer = 1;
int squares = 1;
Console.WriteLine("Введите число, для которого необходимо составить таблицу квадратов:");
int n = Convert.ToInt32(Console.ReadLine());
squares = squareOneToN(n, i, answer);
Console.WriteLine(squares);
*/
Console.WriteLine("Введите число, для которого необходимо составить таблицу квадратов:");
int N = Convert.ToInt32(Console.ReadLine());

for (int i = 1; i <= N; i++)
{
    int result = i * i;
    if (i == N)
    {
        Console.Write(result);
    }
    else
    {
        Console.Write(result + ", ");
    }
}
Console.WriteLine();