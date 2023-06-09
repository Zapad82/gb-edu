﻿//Напишите программу, которая перевернет одномерный массив
//(последний элемент будет на первом месте, а первый - на последнем, и т.д.)

Console.Clear();
int[] array = GetArray(10,0,10);
Console.WriteLine(string.Join(" ", array));
int[] reversArray = ReversArray(array);
Console.WriteLine(string.Join(" ", reversArray));


int[] GetArray(int size, int minValue, int maxValue)
{
    int[] res = new int[size];
    for(int i=0; i<size; i++)
    {
        res[i] = new Random().Next(minValue,maxValue);
    }
    return res;
}
int[] ReversArray(int[] inArray)
{
    int[] result = new int[inArray.Length];
    for(int i = 0; i<inArray.Length; i++)
    {
        result[i] = inArray[inArray.Length - 1 - i];
    }
    return result;
}