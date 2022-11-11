import random

# 1. Напишите программу, которая принимает на вход вещественное число 
# и показывает сумму его цифр.
# *Пример:*
# - 6782 -> 23
# - 0,56 -> 11
n = input('Введите вещественное число: ')
sum = int(n[0])
for i in range(1,len(n)):
    if n[i].isdigit():
        sum = sum + int(n[i])
print(sum)

# 2. Напишите программу, которая принимает на вход число N и 
# выдает набор произведений чисел от 1 до N.
# *Пример:*
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] (1, 1*2, 1*2*3, 1*2*3*4)
n = int(input("Введите число N: "))
result = 1
mass = []
for i in range(n):
    result = result * (i+1)
    mass.append(result)
    # print(result, end=' ')
print(mass)
print()
# n = int(input())
# mass = [math.factorial(i) for i in range(1,n+1)]
# print(mass)


# 3. Задайте список из n чисел последовательности (1+1/n)^n и выведите на экран их сумму.
# *Пример:*
# - Для n = 6: [2.0, 2.25, 2.37037037037037, 2.44140625, 2.4883199999999994, 2.5216263717421135]
n = int(input('Введите количество последовательностей:'))
for i in range(1,n+1):
    result = (1+1/i)**i
    print(f'{result}', end = ", ")
print()
# n = int(input())
# mass = [(1+1/i)**i for i in range(1,n+1)]
# print(mass)
# print(sum(mass))


# 4. Задайте список из 2N+1 элементов, заполненных числами из промежутка [-N, N]. 
# Найдите произведение элементов на указанных позициях. Позиции вводятся с клавиатуры.
n = int(input("Введите число N для определения промежутка от [-N, N]"))
list = []
for i in range((-n),n+1):
    list.append(2*i + 1)
print(list)
pos = int(input("Введите позицию элемента: "))
if pos >= 0 and pos <= len(list):
    for j in range(len(list)):
        pos1 = int(input("Введите позицию элемента: "))
        if pos1 >=0 and pos1 <= len(list):
            pr = list[pos]*list[pos1]
            print(f'Произведение элемента на позиции {pos} на элемент на позиции {pos1} равно {pr}')
        else:
            print('Введен номер позиции, который не существует в данном списке.')
        break
else:
    print('Введен номер позиции, который не существует в данном списке.')


# 5. Реализуйте алгоритм перемешивания списка.
n = int(input('Введите длину списка:'))
print(f'Генерируем список со случайными числами длиной {n}')
rand_list=[]
for i in range(n):
    rand_list.append(random.randint(0,100))
print(f'Получили такой список: {rand_list}')
print('Теперь миксуем список:')
random.shuffle(rand_list)
print(f'Получили новый список: {rand_list}')

# mass = [i for i in range(random.randint(3,6))]
# print(mass)
# random.shuffle(mass)
# print(mass)