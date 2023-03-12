def write_employees(a):
    with open('seminar8/employees.txt', 'a', encoding='utf=8') as f:
        f.write(f'{a}')

def read_employees():
    mass = []
    with open('seminar8/employees.txt', 'r', encoding='utf=8') as f:
        for i in f:
            mass.append(i)

        return mass
        # print(mass)

# функция чтения данных
def read_attribute():
    with open('seminar8/employees.txt', 'r', encoding = 'utf-8') as f:
        return f.read()


# def read_employees_ch():
#     mass = []
#     with open('seminar8/employees.txt', 'r', encoding='utf=8') as f:
#         for i in f:
#             mass.append(i)

#         return mass
#         # print(mass)

# def rename_data(mass):
#     with open('seminar8/employees.txt', 'w', encoding = 'utf=8') as f:
#         for i in mass:
#             f.write(i)

# def write_re(a):
#     with open('seminar8/employees.txt', 'w', encoding='utf=8') as f:
#         for i in a:
#             f.write(i)

import re
import os       
def rename_attribute(file, moment_data, new_data):
    with open(file, 'r', encoding = 'utf-8') as f1, open('%s.bak' % file, 'w', encoding= 'utf-8') as f2:
            for line in f1:
                if moment_data in line:
                    line = line.replace(moment_data, new_data)
                f2.write(line)
    os.remove(file)
    os.rename('%s.bak' % file, file)
    print('Атрибуты изменены')
    print()