
# 2. Напишите программу, которая принимает на вход число N и выдает набор произведений чисел от 1 до N.
# *Пример:*
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)
from math import factorial


n = int(input('Введите число: '))
# получаем список от 1 до 4
def list1(n):
    return [i for i in range(1,n+1)];
print(list1(n)) # смотри на список
res = list(map(lambda x: factorial(x), list1(n))) # с помощью функции map и factorial получаем результат, требуемый в задаче
print(res)


