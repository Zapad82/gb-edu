# Контекст
# Предположим, что нам хочется для любого массива чисел array и любого числа target узнать содержится
# ли target в array. Такую процедуру будем называть поиском.
# Задача
# Реализовать императивную функцию поиска элементов на языке Python.
# Решение: .. ?

def linear_search(array, target):
for i in range(len(array)):
if array[i] == target:
return i
return -1


def search_declarative (array, target):
    return target in array