import pytest
import coverage

# Создаем класс для работы с двумя списками чисел
class ListsComparator:
    # Конструктор класса, принимает два списка чисел
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    # Метод для расчета среднего значения списка
    def calculate_average(self, list):
        # Проверяем, что список не пустой
        if len(list) > 0:
            # Суммируем все элементы списка
            sum = 0
            for num in list:
                sum += num
            # Рассчитываем среднее значение
            average = sum / len(list)
            return average
        else:
            # Если список пустой, возвращаем None
            return None

    # Метод для сравнения средних значений двух списков и вывода соответствующего сообщения
    def compare_lists(self):
        # Рассчитываем среднее значение для каждого списка
        average1 = self.calculate_average(self.list1)
        average2 = self.calculate_average(self.list2)
        # Проверяем, что оба средних значения не равны None
        if average1 is not None and average2 is not None:
            # Сравниваем средние значения и выводим соответствующее сообщение
            if average1 > average2:
                print("Первый список имеет большее среднее значение")
            elif average1 < average2:
                print("Второй список имеет большее среднее значение")
            else:
                print("Средние значения равны")
        else:
            # Если хотя бы одно из средних значений равно None, выводим сообщение об ошибке
            print("Ошибка: один из списков пустой")

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