# 1)Дан список. Выведите те его элементы, которые встречаются в списке только один раз. 
# Элементы нужно выводить в том порядке, в котором они встречаются в списке.
list1 = [1,2,3,4,4,5,5,6]
list2 =[]
for i in list1:
    if list1.count(i) == 1:
        list2.append(i)
print(list2)


# 2) Задайте список. Напишите программу, которая определит, присутствует ли в заданном списке строк некое число.
# ['fff', '3fdfs', '4'] --> YES
list1 = ['fff', '3fdfs', '4']
result = "No"
for i in list1:
    try:
        result = "Yes"
        break
    except:
        pass
print(result)
# 3) Напишите программу, которая определит позицию второго вхождения строки в списке либо сообщит, что её нет.
# Пример:
# список: ["qwe", "asd", "zxc", "qwe", "ertqwe"], ищем: "qwe", ответ: 3
# список: ["йцу", "фыв", "ячс", "цук", "йцукен", "йцу"], ищем: "йцу", ответ: 5
# список: ["йцу", "фыв", "ячс", "цук", "йцукен"], ищем: "йцу", ответ: -1
# список: ["123", "234", 123, "567"], ищем: "123", ответ: -1
# список: [], ищем: "123", ответ: -1
list1 = []
findstr = "qwe"
counter = 0
index = -1
for i in range(len(list1)):
    if list1[i] == findstr:
        counter += 1
        if counter == 2:
            index = i
            break
print(index)
