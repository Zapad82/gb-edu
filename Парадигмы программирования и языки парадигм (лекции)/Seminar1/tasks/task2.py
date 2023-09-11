# Условие
# На вход подается: список целых чисел arr
# ● Задача
# Реализовать императивную функцию, которая возвращает три числа:
# ○ Долю позитивных чисел
# ○ Долю нулей
# ○ Долю отрицательных чисел
def count_numbers(arr):
    positive = 0
    zero = 0
    negative = 0
    for num in arr:
        if num > 0:
            positive += 1
        elif num == 0:
            zero += 1
        else:
            negative += 1
    total = len(arr)
    return positive/total, zero/total, negative/total


# Условие
# На вход подается: список целых чисел arr
# ● Задача
# Реализовать императивную функцию, которая возвращает три числа:
# ○ Долю позитивных чисел
# ○ Долю нулей
# ○ Долю отрицательных чисел
def get_numbers_ratio(arr):
    positive_count = len([x for x in arr if x > 0])
    zero_count = len([x for x in arr if x == 0])
    negative_count = len([x for x in arr if x < 0])
    
    total_count = len(arr)
    
    positive_ratio = positive_count / total_count
    zero_ratio = zero_count / total_count
    negative_ratio = negative_count / total_count
    
    return (positive_ratio, zero_ratio, negative_ratio)
