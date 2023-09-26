# Сортировка слиянием

# Контекст
# Ещё один известный и довольно эффективный алгоритм
# сортировки массива - сортировка слиянием (merge sort).
# Алгоритм делится на два этапа:
# ○ этап разбиения - массив разбивается на пару
# массивов до тех пор пока, полученные массивы не
# станут массивами длины 1 (состоящими из одного
# элемента).
# ○ этап слияния - соединяем пары массивов в большие
# массивы так, чтобы полученные массивы были
# отсортированы.
# ● Ваша задача
# Реализовать сортировку слиянием на любом языке в любой
# парадигме. На вход ваша программа получает массив из
# чисел, а вернуть должна отсортированный массив.


arr = [2, 5, 2, 8, 9, 23, 6]

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left = arr [:mid]
    right = arr[mid:]

    left = merge_sort(left)
    right = merge_sort(right)

    return merge(left, right)

def merge(left, right):
    arr_result = []
    i_left = 0
    i_right = 0
    while len(left) > i_left and len(right) > i_right:
        if left[i_left] > right[i_right]:
            arr_result.append(right[i_right])
            i_right += 1
        else:
            arr_result.append(left[i_left])
            i_left += 1
    while len(left) > i_left:
        arr_result.append(left[i_left])
        i_left += 1
    while len(right) > i_right:
        arr_result.append(right[i_right])
        i_right += 1
    return arr_result

print(merge_sort(arr))