# Задача 0:
# Написать программу для сложения двух чисел
# sum = lambda a, b: a + b
# x = int(input('x = '))
# y = int(input('y = '))
# print(f'{x} + {y} = {sum(x, y)}')
# То, что выше, в настоящем приложении писать не правильно

# Продумать архитектуру приложения. Подумать, какие модули можно выделить в рамках текущего задания.


# Задача 1

# Идея: совместная разработка
# Система собирает информацию с датчиков, в ней есть модуль логирования, который заносит в журнал все обращения к датчикам.
# В системе есть модуль, выполняющий обращения для получения данных с датчиков и модуль генерации html-представления.
# Запуск системы осуществляется из головного модуля.

# Модуль 1: сбор информации с датчиков (data_provider)
# Модуль 2: логирование (logger)
# Модуль 3: UI (user_interface)
# Модуль 4: HTML-генератор (html_creater)
# Модуль 5: главный модуль (main)

# data_provider
#     get_temperature, get_pressure, get_wind_speed
# logger
#     temperature_logger, pressure_logger, wind_speed_logger
# user_interface
#     temperature_view, pressure_view, wind_speed_view
# html_creater
#     create
# main
#     #запустить систему


# Задача 2 (ДЗ)
# Есть файл, состоящий из N тысяч строк, содержащих информацию о неких пользователях.
# Предлагаемые поля: id, имя, фамилия, день рождения, место работы, номер телефона (может быть несколько).
# В качестве символа разделителя использовать пустую строку.