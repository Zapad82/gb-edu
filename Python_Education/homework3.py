# '1. Задайте список из нескольких чисел. Напишите программу, 
# которая найдёт сумму элементов списка, стоящих на нечётной позиции.
# *Пример:*
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12
list1 = [2, 3, 5, 9, 3]
sum = 0
for i in range(len(list1)):
    if i % 2 != 0:
        sum += list1[i]
print(sum)
print()

#другое решение
import random
def sumOfuneven(mass):
    count = 0
    for i in range(1, len(mass), 2):
        count += mass[i]
    print(count)
a = [random.randint(1,10) for i in range(5)]
print(a)
sumOfuneven(a)
print()

# '2. Напишите программу, которая найдёт произведение пар чисел списка. 
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# *Пример:*
# - [2, 3, 4, 5, 6] => [12, 15, 16];
# - [2, 3, 5, 6] => [12, 15]
from re import I
list1 = [2, 3, 4, 5, 6] #задаем список
rev_list1 = list1[::-1] # получаем зеркальный список
new_list1 = [] # задаем пустой список
print(list1)
#print(rev_list)
for i in range(len(list1)):
    if len(list1)%2 == 0: # проверяем список на четность
        new_list1.append(list1[i]*rev_list1[i]) # перемножаем два списка
    else:
        new_list1.append(list1[i]*rev_list1[i]) # перемножаем два списка
if len(new_list1) %2 == 0:
    del new_list1[(int(len(new_list1)/2)):(int(len(new_list1)))] # удаляем лишнюю часть
else:
    del new_list1[(int(len(new_list1)/2)+1):(int(len(new_list1)))] # удаляем лишнюю часть
print(new_list1) # печатаем
print()

# другое решение
def sumofpairs(mass):
    resmass = []
    if len(mass) % 2 == 0:
        for i in range(len(mass)//2):
            resmass.append(mass[i]*mass[len(mass) - 1-i])
    else:
        for i in range(len(mass)//2+1):
            resmass.append(mass[i]*mass[len(mass) - 1-i])
    print(resmass)
a = [random.randint(1,10) for i in range(5)]
print(a)
sumofpairs(a)

# '3. Задайте список из вещественных чисел. Напишите программу, 
# которая найдёт разницу между максимальным и минимальным значением дробной части элементов.
# *Пример:*
# - [1.1, 1.2, 3.1, 5, 10.01] => 0.19
import math
list1 = [1.1, 1.2, 3.1, 5, 10.01]
new_list1 = []
for i in range(len(list1)):
    new_list1.append(list1[i] - math.trunc(list1[i])) # удаляем целые
for index, item in enumerate(new_list1):
    if item:
        new_list1[index] = round(new_list1[index], 2) # округляем до двух символов
       #new_list.append(round(new_list[i], 2))
print(new_list1)
new_list1 = list(set(new_list1)) # с помощью набора избавляемся от дубликатов
new_list1.remove(0) # избавляемся от нуля, так как он не учитывается по условиям задачи
max = max(new_list1)
min = min(new_list1)
print(max - min)
print()

# другое решение
def fl(n):
    res = str(n)
    fif = res.find('.')
    res = float('0.'+ res[fif+1::])
def diffiffloat(mass):
    res = []
    for i in mass:
        res.append(fl(i))
    print(max(res) - min(res))

a = [1.01, 22.34, 45.0]
diffiffloat(a)



# '4. Напишите программу, которая будет преобразовывать десятичное число в двоичное.
# *Пример:*
# - 45 -> 101101
# - 3 -> 11
# - 2 -> 10
a = int(input('Введите десятичное число: '))
print(f'Число {a} в двоичной системе равняется: {str(bin(a))[2::]}')

# Второй способ:
a = int(input('Введите десятичное число: '))
b = ''
while a > 0:
    b = str(a % 2) + b
    a = a // 2
print(b)

