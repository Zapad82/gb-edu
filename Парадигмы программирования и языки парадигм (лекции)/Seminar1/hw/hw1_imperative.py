# Задача №1
# Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
# сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки.

def sort_list_imperative(numbers):
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[j] > numbers[i]:
                numbers[i], numbers[j] = numbers[j], numbers[i]
    return numbers

numbers=[5, 2, 1, 9, 3]
sorted_numbers = sort_list_imperative(numbers)
print(sorted_numbers)