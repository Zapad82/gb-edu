import math
# Напишите программу, которая принимает на вход цифру, 
# обозначающую день недели, и проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет
print('Задача 1: \n Является ли введенное число, которое равно дню недели, выходным днем?')
number = int(input('Введите число от 1 до 7: '))
if number < 1 or number > 7:
    print('Вы ввели неверное число')
elif 6 <= number <= 7:
    print('Да')
else:
    print('Нет')
print()


# Напишите программу для. проверки истинности утверждения 
# ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат.
print('Задача 2. \n Проверить, истинно ли ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z для всех значений предикат?')
for x in range(2):
        for y in range(2):
            for z in range(2):
                print(not (x or y or z) == (not x and not y and not z))
                print(x, y, z)
print()


# Напишите программу, которая принимает на вход координаты точки (X и Y), 
# причём X ≠ 0 и Y ≠ 0 и выдаёт номер четверти плоскости, 
# в которой находится эта точка (или на какой оси она находится).
# Пример:
# - x=34; y=-30 -> 4
# - x=2; y=4-> 1
# - x=-34; y=-30 -> 3
print('Задача 3 \n Определить номер четверти координатной плоскости по введенным значениям X и Y')
x, y = int(input('Введите значение Х:')), int(input('Введите значение Y:'))
if x > 0 and y > 0:
    print('1-я четверть')
elif x < 0 and y > 0:
    print('2-я четверть')
elif x < 0 and y < 0:
    print('3-я четверть')
else:
    print('4-я четверть')
print()


# Напишите программу, которая по заданному номеру четверти, 
# показывает диапазон возможных координат точек в этой четверти (x и y).
print('Задача 4 \n По введенному числу показать диапазон возможных координат в этой четверти')
number = int(input('Введите номер четверти: '))
if number > 4 or number < 1:
    print('Вы ввели неверный номер четверти координат. Верный номер возможен в диапазоне 1 - 4')
else:
    if number == 1:
        print('Возможны следующие координаты: Ось X > 0, Ось Y > 0')
    if number == 2:
        print('Возможны следующие координаты: Ось X < 0, Ось Y > 0')
    if number == 3:
        print('Возможны следующие координаты: Ось Х < 0. Ось Y < 0')
    if number == 4:
        print('Возможны следующие координаты: Ось X > 0, Ось Y < 0')
print()


# Напишите программу, которая принимает на вход координаты двух точек 
# и находит расстояние между ними в 2D пространстве.
# Пример:
# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21
print('Определить расстояние между точками по координатам:')
x1 = int(input('Введите координату точки X1: '))
y1 = int(input('Введите координату точки Y1: '))
x2 = int(input('Введите координату точки X2: '))
y2 = int(input('Введите координату точки Y2: '))
distance = math.sqrt((x2-x1)**2 + (y2-y1)**2)
print(distance)