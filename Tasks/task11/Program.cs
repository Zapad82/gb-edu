/* 
11. Напишите программу, которая выводит случайное трёхзначное число и удаляет вторую цифру этого числа.
456 -> 46
782 -> 72
918 -> 98



*/


int randomNumber = new Random().Next(100, 999);
Console.WriteLine(randomNumber);

int firstNumber = randomNumber / 100;
int secondNumber = randomNumber % 10;
Console.Write($"{firstNumber}{secondNumber}");
