# # типы данных и переменная
# # int, float, boolean, str, list, None
# value = None
# #print(type(value))
# a = 123
# b = 1.23
# #print(type(a))
# #print(type(b))
# value = 12334
# #print(type(value))
# s ='hello \n world'
# #print(s) #вывод строки
# #print(a,'-',b,'-', s)
# #print('{} - {} - {}'.format(a,b,s))
# #print(f'{a} - {b} - {s}')

# f = True
# #print(f)

# list = ['1', '2', '3']
# col = ['hello', 1, 2, 3.4, True]
# #print(list)
# #print(col)

# # print('Введите а');
# # a = int(input())
# # print('Введите b');
# # b = int(input())
# # print(a, ' + ', b, ' = ', a+b)
# # print('{} {}'.format(a, b))
# # print(f'{a} {b}')

# Арифметические операции
# +, -, *, /, %, //, **
# **, 
# a = 3
# b = 3
# c = round(a*b, 5)
# print(c)
# a = a + 5
# print(a)
# a += 5
# print(a)


# a = 1 < 3 < 5
# print(a)

# func = 1
# T = 4
# x = 2
# print(func<T>(x))

# f = 1 > 2 or 4 < 6
# print(f)

# f = [1,2,3,4]
# print(f)
# print(not 2 in f)

# is_odd = not f[0] % 2
# print(is_odd)

# Управляющие конструкции
# if, if-else

# a = int(input('a = '))
# b = int(input('b = '))
# if a > b:
#     print(a)
# else:
#     print(b)

# username = input('Введите имя: ')
# if username == 'Маша':
#     print('Ура, это же МАША!')
# elif username == 'Марина':
#     print('Я так ждала Вас, Марина!')
# elif username == 'Ильнар':
#     print('Ильнар - топ!')
# else:
#     print('Привет, ', username)

# original = 23
# inverted = 0
# while original != 0:
#     inverted = inverted * 10 + (original % 10)
#     original //= 10
# else:
#     print('Пожалуй')
#     print('хватит )')
# print(inverted)

# Управляющие конструкции:
# for

# for i in 1,2,3,4,5:
#     print(i**2)

# list = [1,2,3,4,5]
# for i in list:
#     print(i**2)

# r = range(5)
# for i in r:
#     print(i)

# for j in range(2, 10, 2):
#     print(j)

# text = 'съешь ещё этих мягких французских булок'
# print(len(text))        #39
# print('ещё' in text)    # True
# print(text.isdigit())   #False
# print(text.islower())   #True
# print(text.replace('ещё','ЕЩЁ'))  #

# for c in text:
#     print(c)

# Списки: введение
# list = list

# numbers = [1, 2, 3, 4, 5]
# print(numbers)
# ran = range(1, 6)
# print(type(ran))
# numbers = list(ran)
# print(type(numbers))

# print(numbers)                      #[1, 2, 3, 4, 5]
# numbers[0] = 10                 
# print(f'{len(numbers)} len')
# print(numbers)                      #[10, 2, 3, 4, 5]
# for i in numbers:
#     i *= 2
#     print(i)                        #[20, 4, 6, 8, 10]
# print(numbers)                      #[10, 2, 3, 4, 5]

# colors = ['red', 'green', 'blue']
# for e in colors:
#     print(e)            # red green blue
# for e in colors:
#     print(e*2)          # redred greengreen blublue

# colors.append('gray')   # добавить в конец
# print(colors == ['red', 'green', 'blue', 'gray']) # True
# colors.remove('red')    # del colors[0] удалить элемент

def f(x):
    if x == 1:
        return 'Целое'
    elif x == 2.3:
        return 23
    else:
        return

arg = 2.3
print(f(arg))
print(type(f(arg)))