# Модуль внесения записи и поиска контакта


# Добавляем контакт
def add_contact():
    name = input('Введите имя: ')
    firstName = input('Введите фамилию: ')
    phone = input('Введите номер телефона: ')
    directory = name + ' ' + firstName + ' ' + '||' + ' ' + phone +'\n'
    return directory

# Ищем контакт
def find_contact(f):
    a = input('Введите данные для поиска: ')
    findC = list(filter(lambda x: a in x, f.split('\n')))
    return findC

