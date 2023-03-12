# Запись данных в файл

# colors = ['red', 'green', 'blue'] #Есть такой список
# data = open('file.txt', 'a') #Делаем связь с файлом на дозапись
# #data.writelines(colors) #разделителей не будет, произвели запись
# data.write('\nLINE 12\n')
# data.write('LINE 1 3 \n')
# data.close() #разрыв подключения файловой переменной с файлом

# with open('file.txt', 'w') as data:
#     data.write('line 1\n')
#     data.write('line 2 \n')

# Чтение данных из файла
# path = 'file.txt'
# data = open(path, 'r')
# for line in data:
#     print(line)
# data.close()


#Использование функций из других файлов
# import hello as h #назначение альяса импортироемуму файлу hello
# print(h.f(1))


# #Возможность передачи неограниченного количества аргументов
# def concatenatio(*params):
#     res: str = ""
#     for item in params:
#         res += item
#     return res

# print(concatenatio('a', 's', 'd', 'w')) #asdw
# print(concatenatio('a', '1', 'd', '2')) #a1d2


#Рекурсия
# def fib(n):
#     if n in [1, 2]:
#         return 1
#     else:
#         return fib(n-1) + fib(n-2)

# list = []
# for e in range(1, 10):
#     list.append(fib(e))
# print(list)


#Кортежи
# a = (3, 4, 5)
# print(a)
# print(a[0])
# print(a[-1])

# for item in a:
#     print(item)

# dictionary = {}
# dictionary = \
#     {
#         'up': 'вверх',
#         'left': 'влево',
#         'down': 'вниз',
#         'right': 'вправо'
#     }
# # for k in dictionary.keys():
# #     print(k)
# # for k in dictionary.values():
# #     print(k)
# for v in dictionary:
#     print(v)
#     print(dictionary[v])


#Множества
# colors = {'red', 'green', 'blue'}
# print(type(colors))
# print(colors)
# colors.add('red')
# print(colors)
# colors.add('gray')
# print(colors)
# #colors.remove('red')
# colors.discard('red')
# print(colors)
# colors.clear()
# print(colors)

# s = frozenset.colors() #Замороженное множество не подлежащее изменениям

# list1 = [1,2,3,4,5]
# list2 = list1

# list1[0] = 123
# list2[1] = 456

# for e in list1:
#     print(e)
# print()
# for e in list2:
#     print(e)

list1 = [1,2,3,4,5]
# print(list1.pop(2)) #.pop удаляет символ из списка
# print(list1.pop())
# print(list1)
# print(list1.pop())
# print(list1)
# print(list1.pop())
# print(list1)
print(list1.insert(2, 11)) #добавление элемента в нужную позицию
print(list1.append(11)) #добавление элемента в конец списка
print(list1)