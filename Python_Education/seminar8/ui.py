# Создать иформационную систему позволяющую работать с сотрудниками некой компании \ студентами вуза \ учениками школы.


from model import add_employees, find_employees, changes_employees, change_attribute, attribute_search, changed_employees
from logger import rename_attribute, write_employees, read_employees, read_attribute #rename_data, write_re, read_employees_ch, 


while True:
    print('Выберите режим работы с данными сотрудников: ')
    print('\
        1. Внести данные нового сотрудника\n\
        2. Поиск данных сотрудника по базе\n\
        3. Вывести всех сотрудников на экран\n\
        4. Внести изменения по значению атрибута сотрудника\n\
        0. Выйти из программы')
    mode = int(input())
    if mode == 1:
        a = add_employees()
        write_employees(a)

    elif mode == 2:
        print(find_employees(read_employees()))

    elif mode == 3:
        print(read_employees())

    # elif mode == 4:
    #     mass = read_employees_ch()
    #     # print(mass)
    #     write_re(changes_employees(mass))
    
    elif mode == 4:
        moment_data = attribute_search(read_attribute())
        print(moment_data)
        while moment_data.count('\n') > 0:
            print('Уточните критерии поиска, чтобы получить атрибуты нужного сотрудника')
            moment_data = attribute_search(moment_data)
            print(moment_data)
        new_data = change_attribute(moment_data)
        rename_attribute('seminar8/employees.txt', moment_data, new_data)
    elif mode == 0: # выход из программы
        print('Работа с программой окончена.')
        break

    else:
        print('Введено неверное значение!')