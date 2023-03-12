# Добавляем контакт
def add_employees():
    id = input('Введите ID: ')
    name = input('Введите имя: ')
    firstName = input('Введите фамилию: ')
    phone = input('Введите номер телефона: ')
    post = input('Введите должность: ')
    salary = input('Введите заработную плату: ')
    directory = id + ' ' + name + ' ' + firstName + \
        ' ' + phone + ' ' + post + ' ' + salary + '\n'
    return directory

# Ищем контакт


def find_employees(f):
    a = input('Введите данные для поиска: ')
    findC = list(filter(lambda x: a in x, f))
    return findC


def changed_employees():
    id = input('Введите ID: ')
    name = input('Введите имя: ')
    firstName = input('Введите фамилию: ')
    phone = input('Введите номер телефона: ')
    post = input('Введите должность: ')
    salary = input('Введите заработную плату: ')
    directory = id + ' ' + name + ' ' + firstName + \
        ' ' + phone + ' ' + post + ' ' + salary
    return directory


def changes_employees(mass):
    findC = find_employees(mass)
    index = mass.index(findC[0])
    mass[index] = changed_employees()
    return mass
    # print(findC)


# функция поиска данных сотрудника
def attribute_search(f):
    a = input('Введите данные для поиска: ')
    data = list(filter(lambda x: a in x, f.split('\n')))
    b = '\n'.join(data)
    return b


# функция редактирования данных по атрибуту
def change_attribute(s):
    b = ' '
    f = list(filter(lambda x: b not in x, s.split(b)))
    print('Выберите индекс атрибута, который хотите изменить:\n\
        ID ->               0\n\
        Имя ->              1\n\
        Фамилия ->          2\n\
        Номер телефона ->   3\n\
        Должность ->        4\n\
        Заработная плата -> 5')
    check_attribute = int(input('-> '))
    print(f'Значение выбранного атрибута сейчас: {f[check_attribute]}')
    new_attribute = input('Введите новое значение атрибута -> ')
    f[check_attribute] = f'{new_attribute}'
    new_data = ' '.join(f)
    return new_data
