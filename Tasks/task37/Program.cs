/*
Задача 37: Найдите произведение пар чисел в одномерном массиве.
Парой считаем первый и последний элемент, второй и предпоследний
и т.д. Результат запишите в новом массиве.
[1 2 3 4 5] -> 5 8 3
[6 7 3 6] -> 36 21
*/

Console.Clear();
int [] GetArray(int size, int minValue, int maxValue) 
{ 
    int [] res = new int [size]; 
    for(int i = 0; i < size; i++) 
    { 
        res[i] = new Random().Next(minValue, maxValue + 1); 
        Console.Write($"{res[i]} "); 
        
    } 
    return res; 
} 
int [] array = GetArray(5, 0, 9); 
Console.WriteLine(); 
int pow = 0; 
for(int i = 0; i <= array.Length / 2; i++) 
{ 
    if(i != array.Length - 1 - i) 
    { 
        pow = array[i] * array[array.Length - 1 - i]; 
    } 
    else 
    { 
        pow = array[i]; 
    } 
    Console.Write($"{pow} "); 
}
Console.WriteLine(); 