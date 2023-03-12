# 1. Задайте строку из набора чисел. Напишите программу, которая покажет большее и меньшее число. 
# В качестве символа-разделителя используйте пробел.
from cmath import sqrt
import random
a = [random.randint(1,10) for i in range(5)]
print(a)
print(f'{max(a)} {min(a)}')


# 2. Найдите корни квадратного уравнения Ax² + Bx + C = 0 двумя способами:
# 1) с помощью математических формул нахождения корней квадратного уравнения
import math
def equal(a, b, c):
    d = b**2 - 4*a*c
    if d > 0:
        x1 = (-b + sqrt(d)) / (2*a)
        x2 = (-b - sqrt(d))/ (2*a)
        print(f'x1 = {x1}, x2 = {x2}')
    if d == 0:
        x = -b / (2 * a)
        print(f'x = {x}')
    if d < 0:
        print('Уравнение не имеет корней')
equal(4, -7, -2)
# 2) с помощью дополнительных библиотек Python
import sympy
a = int(input())
b = int(input())
c = int(input())
a * x**2 + b * x + c = 0
x = sympy.Symbol('x')
f = input()
print(sympy.solve(f, x))

# Задайте два числа. Напишите программу, которая найдёт НОК (наименьшее общее кратное) этих двух чисел.
def NOK(x, y):
    if y == 0:
        return x
    return NOK(y, x % y)
x, y = map(int, input().split())
print(x * y // NOK(x, y))
