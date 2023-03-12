# Модуль записи и чтения контакта

def write_contact(a):
    with open('homework7/phonebook.txt', 'a', encoding='utf=8') as f:
        f.write(f'{a}\n')

def read_contact():
    with open('homework7/phonebook.txt', 'r', encoding='utf=8') as f:
        return f.read()
