﻿/*
Имеется одномерный массив array из n элементов. Требуется найти элемент, равный find
    1. Установить счетчик index в позицию 0
    2. Если array[index] = find, алгоритм завершает работу успешно
    3. Увеличить index на 1
    4. Если index < n, то перейти к шагу 2, в противном случае алгоритм завершил работу безуспешно
*/

int[] array = {1, 12, 31, 4, 15, 1, 16, 17, 18};
int n = array.Length;
int find = 15;
int index = 0;

while(index < n)
{
    if(array[index] == find)
    {
        Console.WriteLine(index);
        //break прерывает работу алгоритма, если в массиве имеется несколько искомых одинаковых значений,
        //например, 1 на 0 индексе и на 5, и ищем мы число, равное 1.
        break;
    }
    //index = index + 1;
    index++;
}
