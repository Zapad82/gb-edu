# Импортируем библиотеки для тестирования и измерения покрытия кода

import pytest
import coverage
import ListsComparator
from ListsComparator import ListsComparator
# Тесты для класса ListsComparator
# Тест на правильность расчета среднего значения для не пустого списка
def test_calculate_average():
    list = [1, 2, 3, 4, 5]
    lists_comparator = ListsComparator([], list)
    assert lists_comparator.calculate_average(list) == 3

# Тест на возвращение None при расчете среднего значения для пустого списка
def test_calculate_average_empty_list():
    list = []
    lists_comparator = ListsComparator([], list)
    assert lists_comparator.calculate_average(list) is None

# Тест на правильность сравнения двух списков и вывод соответствующего сообщения
def test_compare_lists():
    list1 = [1, 2, 3, 4, 5]
    list2 = [6, 7, 8, 9, 10]
    lists_comparator = ListsComparator(list1, list2)
    assert lists_comparator.compare_lists() == "Второй список имеет большее среднее значение"

# Тест на обработку ошибки при сравнении списков с None в средних значениях
def test_compare_lists_with_none():
    list1 = [1, 2, 3, 4, 5]
    list2 = []
    lists_comparator = ListsComparator(list1, list2)
    assert lists_comparator.compare_lists() == "Ошибка: один из списков пустой"

# Создаем отчет о покрытии кода тестами
cov = coverage.Coverage()
cov.start()

# Запускаем тесты
pytest.main()

# Останавливаем измерение покрытия кода и создаем отчет
cov.stop()
cov.save()
cov.report()

# Выводим процент покрытия кода тестами
print("Покрытие кода тестами: {}%".format(cov.html_report()))

# Результат выполнения программы:
# Первый список имеет большее среднее значение
# Покрытие кода тестами: 100%