# def f(x):
#     x**2

# g = f
# print(f(1))
# print(g(1))

# def f(x):
#     return x**2

# g = f

# print(type(f))
# print(type(g))
# print(f(2))
# print(g(4))



# def calc1(x):
#     return x+10

# # print(calc1(10))


# def calc2(x):
#     return x*10

# # print(calc2(10))

# def math(op, x):
#     print(op(x))

# math(calc2, 10)
# math(calc1, 10)


# def sum(x, y):
#     return x+y
## sum = lambda x, y: x+y

# def mylt(x, y):
#     return x*y

# def calc(op, a, b):
#     print(op(a, b))
#     # return op(a,b)

# calc(lambda x, y: x+y, 4, 5)


# list = []

# for i in range(1, 101):
#     # if(i%2 == 0):
#     list.append(i);

# print(list)

# list =[(i, i) for i in range(1,21) if i%2 == 0]
# print(list)


# def f(x):
#     return x**3
# list =[(i, f(i)) for i in range(1,21) if i%2 == 0]
# print(list)



# Задача:
# В файле хранятся числа, нужно выбрать четные и составить список пар (число; квадрат числа).
# Пример:
# 1 2 3 5 8 15 23 38
# Получить:
# [(2,4), (8,64), (38,1444)]
# path = 'HelloPython/file_lec3.txt' # путь к файлу
# f = open(path, 'r') # связываем файловую переменную с файлом на диске
# data = f.read() + ' ' # читем с искусственным добавлением пробела
# f.close = [] # Закрываем файл

# numbers = [] # Создаем пустой список для наполнения в дальнейшем

# while data != '': # пробегаем по строке и делаем проверку Пока строка не пустая
#     space_pos = data.index(' ') # найти первую позицию пробела
#     numbers.append(int(data[:space_pos])) # взять все то, что находится от первого символа до позиции первого пробела
#     # превратить это в число и добавить в список чисел
#     data = data[space_pos + 1:] # обновить нашу строку с учетом того, то, что мы добавили в нашу выборку 
#     # больше здесь не нужно использовать

# out = [] # создаем новый список
# for e in numbers: # пробегаем по нашему исходному списку
#     if not e % 2: # проверяем, что число действительно является чётным
#         out.append((e, e ** 2)) # добавляем в новый список кортежи, где в качестве первой координаты выступает само число, 
#         # в качестве второго - квадрат этого числа 
# print(out)

# def select(f, col): # создаем функцию, которая принимает какую-то функцию и какой-то набор данных
#     return [f(x) for x in col]

# def where(f, col):
#     return [x for x in col if f(x)]

# data = '1 2 3 5 8 15 23 38'.split()

# res = select(int, data)
# res = where(lambda x: not x%2, res)
# res = select(lambda x:(x, x**2), res)
# print(res)


# li = [x for x in range(1,20)]
# li = list(map(lambda x:x+10, li))
# print(li)


# data = list(map(int, input().split()))
# print(data)

# data = map(int, input().split())
# for e in data:
#     print(e)
# print('--')
# for e in data:
#     print(e)


# def select(f, col): # создаем функцию, которая принимает какую-то функцию и какой-то набор данных
#     return [f(x) for x in col]

# def where(f, col):
#     return [x for x in col if f(x)]

# data = '1 2 3 5 8 15 23 38'.split()

# res = map(int, data)
# res = where(lambda x: not x%2, res)
# res = list(map(lambda x:(x, x**2), res))
# print(res)


# data = [x for x in range(10)]

# res = list(filter(lambda x: not x%2, data))
# print(res)


# def select(f, col): # создаем функцию, которая принимает какую-то функцию и какой-то набор данных
#     return [f(x) for x in col]
# data = '1 2 3 5 8 15 23 38'.split()
# res = map(int, data)
# res = filter(lambda x: not x%2, res)
# res = list(map(lambda x:(x, x**2), res))
# print(res)


# users = ['user1', 'user2', 'user3', 'user4', 'user5']
# ids = [4, 5, 9, 14, 7]
# salary = [111, 222, 333]
# data = list(zip(users, ids, salary))
# print(data)


users = ['user1', 'user2', 'user3', 'user4', 'user5']
ids = [4, 5, 9, 14, 7]
salary = [111, 222, 333]
data = list(enumerate(users))
print(data)