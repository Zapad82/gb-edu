
# 3. Напишите программу, которая принимает на вход два числа и проверяет, является ли одно число квадратом другого.

from cmath import sqrt


a, b = int(input('Введите число А: ')), int(input('Введите число Б: '))
# li = [a, b]
# print(li)
# def f(x):
#     if li[0] == li[1]**2:
#         return 'Да';
#     elif li[1] == li[0]**2:
#         return 'Да';
#     else:
#         return 'Нет';
# print(f(li))
# print(list)
f = lambda a, b: a == sqrt(b) or b == sqrt(a)
if f(a,b) == True:
    print('Да, одно число является квадратом второго')
else:
    print('Нет, одно число не является квадратом второго')